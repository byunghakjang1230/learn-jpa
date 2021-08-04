package org.example.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.example.jpa.utils.JpaEntityManagerFactoryUtil;
import org.junit.jupiter.api.BeforeEach;

public class EntityManagerTest {
    protected EntityManager em;
    protected EntityTransaction tx;

    @BeforeEach
    void setUp() {
        em = JpaEntityManagerFactoryUtil.createEntityManager();
        tx = em.getTransaction();
    }
}
