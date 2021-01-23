package com.test.apache.daos;

import com.test.apache.entities.Banco;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Collections;
import java.util.List;

public class BancoDao implements IBancoDao{
    EntityManager em;

    public BancoDao() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("testapache");
        this.em = emf.createEntityManager();
    }

    @Override
    public List<Banco> listBancos(){
        try {
            em.getTransaction().begin();
            List<Banco> bancoList = em.createQuery("SELECT b FROM bancos b").getResultList();
            em.getTransaction().commit();
            em.close();
            return bancoList;
        }catch (Exception ex){
            ex.printStackTrace();
            return Collections.emptyList();
        }
    }
}
