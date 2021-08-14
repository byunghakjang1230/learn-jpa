package org.example.jpa.domain.step4;

import org.example.jpa.EntityManagerTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EntityIdentityPKTest extends EntityManagerTest {
    @Test
    @DisplayName("IDENTITY 전략 자동 PK 생성")
    void identity_generatedValue() {
        print("====== Transaction Start!");
        tx.begin();
        print("====== persist()");
        em.persist(new EntityIdentityPK("hi"));
        print("====== Transaction End!");
        tx.commit();
    }
}
