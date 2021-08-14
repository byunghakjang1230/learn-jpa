package org.example.jpa.domain.step4;

import org.example.jpa.EntityManagerTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EntitySequencePKTest extends EntityManagerTest {
    @Test
    @DisplayName("시퀀스 전략")
    void sequence_entity() {
        EntitySequencePK entity1 = new EntitySequencePK("hi");
        EntitySequencePK entity2 = new EntitySequencePK("hi");
        print("====== Transaction Start!");
        tx.begin();
        print("====== persist()");
        em.persist(entity1);
        print("====== Transaction End!");
        tx.commit();
        print("====== Transaction Start!");
        tx.begin();
        print("====== persist()");
        em.persist(entity2);
        print("====== Transaction End!");
        tx.commit();
    }
}
