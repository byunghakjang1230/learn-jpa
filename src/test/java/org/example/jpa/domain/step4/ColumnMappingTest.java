package org.example.jpa.domain.step4;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.example.jpa.EntityManagerTest;
import org.junit.jupiter.api.Test;

class ColumnMappingTest extends EntityManagerTest {
    @Test
    void column_entity() {
        ColumnMapping entity = new ColumnMapping("hi", BigDecimal.TEN, BigInteger.TEN, BigDecimal.TEN, "hi", "hi", "hi", "hey");
        print("====== Transaction Start!");
        tx.begin();
        print("====== persist()");
        em.persist(entity);
        print("====== Transaction End!");
        tx.commit();
        print("====== Transaction Start!");
        tx.begin();
        print("====== find()");
        ColumnMapping columnMapping = em.find(ColumnMapping.class, entity.getId());
        columnMapping.setUpdatable("Update");
        columnMapping.setName("hihi");
        print("====== Transaction End!");
        tx.commit();
    }
}
