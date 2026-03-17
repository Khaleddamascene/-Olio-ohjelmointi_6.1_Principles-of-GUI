package Dao;

import Entity.Transaktion;
import jakarta.persistence.EntityManager;
import Datasource.MariaDbJpaConnection;

public class TransactionDao {

    public void persist(Transaktion transaktion) {
        EntityManager em = MariaDbJpaConnection.getInstance();

        try {
            em.getTransaction().begin();
            em.persist(transaktion);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw e;
        }
    }
}