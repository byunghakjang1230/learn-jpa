package org.example.jpa.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.example.jpa.EntityManagerTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserTest extends EntityManagerTest {

    @Test
    @DisplayName("H2 연결 및 JPA 동작 확인")
    void connect_test() {
        // given
        tx.begin();
        User user = new User("name", 25);

        // when
        em.persist(user);
        tx.commit();

        // then
        assertThat(user.getId()).isNotNull();
    }
}
