package org.example.jpa.domain.step4;

import org.example.jpa.EntityManagerTest;
import org.junit.jupiter.api.Test;

class EntityChangeNamesTest extends EntityManagerTest {
    @Test
    void change_names() {
        tx.begin();
        em.persist(new EntityChangeNames("id1", "hi", "name"));
        tx.commit();
    }
}
