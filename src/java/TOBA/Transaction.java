/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TOBA;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jhronek
 */
@Entity
public class Transaction implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long transactionID;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDate;
    
    private double amount;
    
    @ManyToOne
    private Account fromAcct;
    @ManyToOne
    private Account toAcct;

    public Transaction() {
    }
    
    public Transaction(double amount, Account fromAcct, Account toAcct) {
        this.amount = amount;
        this.fromAcct = fromAcct;
        this.toAcct = toAcct;
        this.transactionDate = transactionDate;
    }
}
