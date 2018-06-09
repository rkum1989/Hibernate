package com.java.hibernate.example.version;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab24Client1 {
    public static void main(String[] args) {

        try {
            SessionFactory sf = AHibernateUtil.getSessionFactory();
            Session session = sf.openSession();
            Transaction tx = session.beginTransaction();

            Customer cust = new Customer("ritu", "ritu@gmail.com", new Long(22222222));

            session.save(cust);

            tx.commit();
            session.close();
            AHibernateUtil.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}