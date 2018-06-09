package com.java.hibernate.example.association.mapping.part4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Set;

public class Lab22Client2 {
    public static void main(String[] args) {
        Transaction tx = null;
        try {
            SessionFactory sf = AHibernateUtil.getSessionFactory();
            Session session = sf.openSession();
            tx = session.beginTransaction();

            Customer cust = (Customer) session.load(Customer.class, 1);
            System.out.println(cust.getCid() + "\t" + cust.getCname() + "\t" + cust.getEmail() + "\t" + cust.getPhone() + "\t" + cust.getDob());

            Set<Account> acs = cust.getAccounts();
            for (Account acc : acs) {
                System.out.println(acc.getAccno() + "\t" + acc.getAtype() + "\t" + acc.getBal());
            }

            Account ac = (Account) session.load(Account.class, 2);
            System.out.println(ac.getAccno() + "\t" + ac.getAtype() + "\t" + ac.getBal());

            Set<Customer> ccs = ac.getCustomers();
            for (Customer cus : ccs) {
                System.out.println(cus.getCid() + "\t" + cus.getCname() + "\t" + cus.getEmail() + "\t" + cus.getPhone() + "\t" + cus.getDob());
            }

            tx.commit();
            session.close();
            AHibernateUtil.shutdown();
        } catch (Exception e) {
            if (tx != null)
                tx.rollback();
        }
    }
}
