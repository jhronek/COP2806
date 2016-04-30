package TOBA;

import TOBA.Account;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-30T18:25:57")
@StaticMetamodel(Transaction.class)
public class Transaction_ { 

    public static volatile SingularAttribute<Transaction, Double> amount;
    public static volatile SingularAttribute<Transaction, Account> toAcct;
    public static volatile SingularAttribute<Transaction, Account> fromAcct;
    public static volatile SingularAttribute<Transaction, Date> transactionDate;
    public static volatile SingularAttribute<Transaction, Long> transactionID;

}