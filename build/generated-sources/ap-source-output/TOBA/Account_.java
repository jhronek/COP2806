package TOBA;

import TOBA.Account.AccountType;
import TOBA.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-30T18:25:57")
@StaticMetamodel(Account.class)
public class Account_ { 

    public static volatile SingularAttribute<Account, Long> account_num;
    public static volatile SingularAttribute<Account, Double> balance;
    public static volatile SingularAttribute<Account, AccountType> accountType;
    public static volatile SingularAttribute<Account, User> user;

}