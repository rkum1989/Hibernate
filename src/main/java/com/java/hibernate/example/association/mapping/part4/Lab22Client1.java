package com.java.hibernate.example.association.mapping.part4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Lab22Client1 {
    public static void main(String[] args) {
        Transaction tx = null;
        try {
            SessionFactory sf = AHibernateUtil.getSessionFactory();
            Session session = sf.openSession();
            tx = session.beginTransaction();

            //1.Add Customer
            Customer cust1 = new Customer("ritu", "ritu@jlc", new Date(), new Long(111111));
            session.save(cust1);
            Customer cust2 = new Customer("raj", "raj@jlc", new Date(), new Long(22222222));
            session.save(cust2);

            //2.Add Account
            Account a1 = new Account("SA", 50000.00);
            session.save(a1);
            Account a2 = new Account("CA", 2500000.00);
            session.save(a2);
            Account a3 = new Account("SA", 10000.00);
            session.save(a3);

            Set<Account> accs = new HashSet<Account>();
            accs.add(a1);
            accs.add(a2);
            accs.add(a3);
            cust1.setAccounts(accs);

            Set<Account> accs1 = new HashSet<Account>();
            accs.add(a2);
            accs1.add(a3);
            cust2.setAccounts(accs1);


            tx.commit();
            session.close();
            AHibernateUtil.shutdown();
        } catch (Exception e) {
            if (tx != null)
                tx.rollback();
        }
    }
}
