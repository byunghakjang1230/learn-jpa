package org.example.jpa.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.example.jpa.EntityManagerTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("CRUD 테스트")
class CRUDTest extends EntityManagerTest {

    @Test
    @DisplayName("단일 객체 생성")
    void create() {
        // given
        tx.begin();
        User user = new User("Jang", 37);

        // when
        em.persist(user);
        tx.commit();

        // then
        assertThat(user.getId()).isNotNull();
    }

    @Test
    @DisplayName("단일 객체 조회")
    void select() {
        // given
        tx.begin();

        // when
        User user = em.find(User.class, 1L);
        tx.commit();

        // then
        assertThat(user.getId()).isOne();
    }

    @Test
    @DisplayName("단일 객체 수정")
    void update() {
        // given
        tx.begin();
        User user = em.find(User.class, 1L);

        // when
        user.updateName("byunghak");
        tx.commit();

        // then
        assertThat(user.getId()).isOne();
    }

    @Test
    @DisplayName("단일 객체 삭제")
    void delete() {
        // given
        tx.begin();
        User user = em.find(User.class, 2L);

        // when
        em.remove(user);
        tx.commit();

        // then
        assertThat(em.contains(user)).isFalse();
    }
}
