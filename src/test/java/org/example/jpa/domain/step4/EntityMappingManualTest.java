package org.example.jpa.domain.step4;

import org.example.jpa.EntityManagerTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EntityMappingManualTest extends EntityManagerTest {

    @Test
    @DisplayName("Entity 기반 테이블 생성 - 자동 테이블명 적용")
    void create_table() {
        print("====== Transaction Start!");
        tx.begin();
        print("====== persist()");
        em.persist(new EntityMappingManual("id0", "jang", "byunghak"));
        print("====== Transaction End!");
        tx.commit();
    }
}
