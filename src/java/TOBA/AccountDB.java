/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TOBA;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

/**
 *
 * @author jhronek
 */
public class AccountDB {
        public static void insert(Account account) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.persist(account);
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
            trans.rollback();
        } finally {
            em.close();
        }
    }
    
    public static void update(Account account) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.merge(account);
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
            trans.rollback();
        } finally {
            em.close();
        }
    }
    
    public static void delete(Account account) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.remove(em.merge(account));
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
            trans.rollback();
        } finally {
            em.close();
        }
    }
    
    public static List<Account> selectAccount(Long userId) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        String qString = "SELECT u from Account u " +
                "WHERE u.userId = :userId;";
        TypedQuery<Account> q = em.createQuery(qString, Account.class);
        q.setParameter("userId", userId);
        
        List<Account> results;
        try {
            results = q.getResultList();
            if(results == null || !results.isEmpty()) {
                results = null;
            }
        } catch (NoResultException e) {
            return null;
        } finally {
            em.close();
        }
        
        return results;
    }
    

}
