package org.example.jpa.domain.step4;

import java.util.Date;

import org.example.jpa.EntityManagerTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ExtraColumnMappingTest extends EntityManagerTest {
    @Test
    @DisplayName("기타 컬럼 타입 설정")
    void extraColumn() {
        ExtraColumnMapping entity = new ExtraColumnMapping("hi", ColumnEnum.HI, "hi", new Date(), false);
        tx.begin();
        em.persist(entity);
        tx.commit();
    }
}
