package org.example.jpa.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaEntityManagerFactoryUtil {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

    private JpaEntityManagerFactoryUtil() {
        throw new IllegalStateException("Utility class");
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }

    public static EntityManager createEntityManager() {
        return emf.createEntityManager();
    }
}
