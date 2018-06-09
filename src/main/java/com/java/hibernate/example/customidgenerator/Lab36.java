package com.java.hibernate.example.customidgenerator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab36 {
    public static void main(String[] args) {
        try {
            SessionFactory sf = AHibernateUtil.getSessionFactory();
            Session session = sf.openSession();
            Transaction tx = session.beginTransaction();

            Student stu = new Student(SIDGenerator.getNextSid(), "ritu", "ritu@jlc.com", "333333");
            session.save(stu);
            tx.commit();
            session.close();
            AHibernateUtil.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
