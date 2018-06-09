package com.java.hibernate.example.basics;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab2Client2 {
    public static void main(String[] args) {
        try {
            SessionFactory sf = AHibernateUtil.getSessionFactory();
            Session session = sf.openSession();
            Transaction tx = session.beginTransaction();

            Customer cust = (Customer) session.load(Customer.class, 1);
            System.out.println(cust.getCid() + "\t" + cust.getCity() + "\t" + cust.getCname() + "\t" + cust.getEmail() + "\t" + cust.getPhone());

            tx.commit();
            session.close();
            AHibernateUtil.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
