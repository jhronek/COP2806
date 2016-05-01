/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TOBA;

import TOBA.Account.AccountType;
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
    
    public static Account selectAccount(Long userid, AccountType type) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        String qString = "SELECT * from Account u " +
                "WHERE u.userId = :userId" +
                "AND u.accountType = :accountType;";
        TypedQuery<Account> q = em.createQuery(qString, Account.class);
        
        q.setParameter("userId", userid);
        q.setParameter("accountType", type);
        
        Account account = null;
        try {
            account = q.getSingleResult();
        } catch (NoResultException e) {
            System.out.println(e);
        } finally {
            em.close();
        }
        
        return account;
    }
    
     public static double selectAccountBalance(User user, AccountType type) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        String qString = "SELECT u.balance from Account u " +
                "WHERE u.userId = :userId" +
                "AND u.accountType = :accountType;";
        TypedQuery<Account> q = em.createQuery(qString, Account.class);
        
        q.setParameter("userId", user.getUserId());
        q.setParameter("accountType", type);
        
        double balance = 0.0;
        try {
            balance = q.getSingleResult().getBalance();
        } catch (NoResultException e) {
            System.out.println(e);
        } finally {
            em.close();
        }
        
        return balance;
    }
    

}
