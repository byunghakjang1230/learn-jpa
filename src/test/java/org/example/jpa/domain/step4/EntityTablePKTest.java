package org.example.jpa.domain.step4;

import org.example.jpa.EntityManagerTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EntityTablePKTest extends EntityManagerTest {

    @Test
    @DisplayName("Table 전략")
    void table_pk() {
        EntityTablePK entity1 = new EntityTablePK("hi");
        EntityTablePK entity2 = new EntityTablePK("hi");
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
