package Datasource;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MariaDbJpaConnection {

    private static EntityManagerFactory emf;

    public static EntityManager getInstance() {

        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("CurrencyMariaDbUnit2");
        }

        return emf.createEntityManager();
    }
    public static void close() {
        if (emf != null && emf.isOpen()) {
            emf.close();
        }
    }
}