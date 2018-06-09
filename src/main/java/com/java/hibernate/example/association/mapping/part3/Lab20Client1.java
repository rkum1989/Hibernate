package com.java.hibernate.example.association.mapping.part3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Date;

public class Lab20Client1 {
    public static void main(String[] args) {
        Transaction tx = null;
        try {
            SessionFactory sf = AHibernateUtil.getSessionFactory();
            Session session = sf.openSession();
            tx = session.beginTransaction();

            Order o1 = new Order(2, new Double(200.00), new Date(), "New");
            session.save(o1);
            Order o2 = new Order(3, new Double(300.00), new Date(), "New");
            session.save(o2);
            Order o3 = new Order(4, new Double(400.00), new Date(), "New");
            session.save(o3);

            Customer cust = new Customer("ritu", "ritu@jlc", new Date(), new Long(111111));
            session.save(cust);

            o1.setCustomer(cust);
            o2.setCustomer(cust);
            o3.setCustomer(cust);

            tx.commit();
            session.close();
            AHibernateUtil.shutdown();
        } catch (Exception e) {
            if (tx != null)
                tx.rollback();
        }
    }
}
