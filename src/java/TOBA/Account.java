/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TOBA;

import static TOBA.User_.userId;
import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.metamodel.SingularAttribute;

/**
 *
 * @author jhronek
 */
@Entity
public class Account implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long account_num;
    private double balance;
    public enum AccountType {CHECKING, SAVINGS}
    AccountType accountType = AccountType.CHECKING;
    private long userId;
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private User user;

    //@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    //private ArrayList<Transaction> transactions;
    
    public Account() {
    }  
    
    Account(User user, double balance) {
        this.userId = user.getUserId();
        this.setBalance(balance);
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        String setBal = "Set Balance: " + balance;
        //this.transactions.append(setBal);
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType.toString();
    }
    
    public void setAccountType(String newType) {
        if ("CHECKING".equals(newType.toUpperCase())) {
            this.accountType = AccountType.CHECKING;
        }
        else if ("SAVINGS".equals(newType.toUpperCase())) {
            this.accountType = AccountType.SAVINGS;
        }
    }
    
    public void credit(double credit) {
        String transCredit = "Credit: +" + credit;
        //this.transactions.append(transCredit);
        this.balance += credit;
    }
    
    public void debit(double debit) {
        String transDebit = "Debit: -" + debit;
       // this.transactions.append(transDebit);
        this.balance += debit;
    }
    
    public long getUserId() {
        return userId;
    }
    
    
    
    
}
