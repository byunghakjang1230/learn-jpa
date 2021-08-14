package org.example.jpa.domain.step4;

import org.example.jpa.EntityManagerTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EntityAutoPKDefaultTest extends EntityManagerTest {
    @Test
    @DisplayName("@GeneratedValue 어노테이션 Auto 모드")
    void default_generatedValue() {
        tx.begin();
        em.persist(new EntityAutoPKDefault("hi"));
        tx.commit();
    }
}
