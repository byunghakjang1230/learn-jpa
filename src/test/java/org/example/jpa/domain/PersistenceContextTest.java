package org.example.jpa.domain;

import static org.assertj.core.api.Assertions.assertThat;
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

    private void print(String msg) {
        System.out.println(msg);
    }
}
