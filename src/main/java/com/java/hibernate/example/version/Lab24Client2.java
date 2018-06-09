package com.java.hibernate.example.version;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab24Client2 {
    public static void main(String[] args) {

        try {
            SessionFactory sf = AHibernateUtil.getSessionFactory();
            Session session = sf.openSession();
            Transaction tx = session.beginTransaction();

            Customer cust = (Customer) session.load(Customer.class, 2);
            cust.setCname("raj");
            cust.setEmail("raj@jlc.com");
            session.update(cust);

            tx.commit();
            session.close();
            AHibernateUtil.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
