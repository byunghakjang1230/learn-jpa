package org.example.jpa.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.example.jpa.EntityManagerTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersistenceContextTest extends EntityManagerTest {

    @Test
    @DisplayName("1차 캐시")
    void first_cache() {
        print("====== Transaction Start!");
        tx.begin();
        User user = new User("1차캐시", 1);
        print("====== persist()");
        em.persist(user);
        print("====== find()");
        User user1 = em.find(User.class, user.getId());
        assertAll(
                () -> assertThat(em.contains(user)).isTrue(),
                () -> assertThat(em.contains(user1)).isTrue()
        );
        print("====== Transaction End!");
        tx.commit();
    }

    @Test
    @DisplayName("동일성 보장")
    void identity() {
        print("====== Transaction Start!");
        tx.begin();
        print("====== find() - 1");
        User user1 = em.find(User.class, 1L);
        print("====== find() - 2");
        User user2 = em.find(User.class, 1L);
        print("====== find() - 3");
        User user3 = em.find(User.class, 1L);
        print("====== find() - 4");
        User user4 = em.find(User.class, 1L);
        assertAll(
                () -> assertThat(user1).isSameAs(user2),
                () -> assertThat(user2).isSameAs(user3),
                () -> assertThat(user3).isSameAs(user4)
        );
        print("====== Transaction End!");
        tx.commit();
    }

    @Test
    @DisplayName("트랜잭션을 지원하는 쓰기지연 - 1 정말 될까??")
    void transactional_write_behind1() {
        User user1 = new User("쓰기지연1", 30);
        User user2 = new User("쓰기지연2", 31);
        print("====== Transaction Start!");
        tx.begin();
        print("====== persist()");
        em.persist(user1);
        em.persist(user2);
        print("====== Transaction End!");
        tx.commit();
    }

    @Test
    @DisplayName("트랜잭션을 지원하는 쓰기지연 - 2 이제는 될까??")
    void transactional_write_behind2() {
        LazyUser user1 = new LazyUser("id1", "쓰기지연1", 30);
        LazyUser user2 = new LazyUser("id2", "쓰기지연2", 31);
        print("====== Transaction Start!");
        tx.begin();
        print("====== persist()");
        em.persist(user1);
        em.persist(user2);
        print("====== Transaction End!");
        tx.commit();
    }

    @Test
    @DisplayName("플러스 테스트")
    void flush() {
        LazyUser user1 = new LazyUser("id1", "쓰기지연1", 30);
        LazyUser user2 = new LazyUser("id2", "쓰기지연2", 31);
        print("====== Transaction Start!");
        tx.begin();
        print("====== persist() && flush()");
        em.persist(user1);
        em.flush();
        print("====== persist()");
        em.persist(user2);
        print("====== Transaction End!");
        tx.commit();
    }

    @Test
    @DisplayName("변경 감지")
    void object_update() {
        LazyUser user = new LazyUser("id1", "쓰기지연1", 30);
        print("====== Transaction Start!");
        tx.begin();
        print("====== persist() & flush()");
        em.persist(user);
        em.flush();
        print("====== user.changeName()");
        user.changeName("변경감지");
        print("====== Transaction End!");
        tx.commit();
    }

    @Test
    @DisplayName("엔티티 삭제")
    void remove() {
        LazyUser user = new LazyUser("id", "삭제", 30);
        print("====== Transaction Start!");
        tx.begin();
        print("====== persist() & flush()");
        em.persist(user);
        em.flush();
        print("====== remove()");
        em.remove(user);
        print("====== Transaction End!");
        tx.commit();
    }

    @Test
    @DisplayName("준영속 상태 만들기 detach()")
    void detach() {
        LazyUser user = new LazyUser("id", "삭제", 30);
        print("====== Transaction Start!");
        tx.begin();
        print("====== persist() & flush()");
        em.persist(user);
        em.flush();
        print("====== detach()");
        em.detach(user);
        print("====== em.contains(user) == " + em.contains(user));
        assertThat(em.contains(user)).isFalse();
        print("====== Transaction End!");
        tx.commit();
    }

    @Test
    @DisplayName("준영속 상태 만들기 clear()")
    void clear() {
        LazyUser user = new LazyUser("id", "삭제", 30);
        print("====== Transaction Start!");
        tx.begin();
        print("====== persist() && flush() && clear()");
        em.persist(user);
        em.flush();
        em.clear();
        print("====== em.contains(user) == " + em.contains(user));
        assertThat(em.contains(user)).isFalse();
        print("====== Transaction End!");
        tx.commit();
    }

    @Test
    @DisplayName("준영속 상태 만들기 close()")
    void close() {
        LazyUser user = new LazyUser("id", "삭제", 30);
        print("====== Transaction Start!");
        tx.begin();
        print("====== persist() & flush()");
        em.close();
        assertThatThrownBy(() -> em.persist(user))
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("Session/EntityManager is closed");
        print("====== Transaction End!");
        tx.commit();
    }

    private void print(String msg) {
        System.out.println(msg);
    }
}
