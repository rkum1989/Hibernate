package com.java.hibernate.example.basics;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab2Client1 {
    public static void main(String[] args) {
        try {
            SessionFactory sf = AHibernateUtil.getSessionFactory();
            Session session = sf.openSession();
            Transaction tx = session.beginTransaction();

            Customer cust = new Customer("ritu", "ritu@jlc.com", "Blore", 99990000);
            session.save(cust);

            tx.commit();
            session.close();
            AHibernateUtil.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
