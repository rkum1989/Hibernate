package com.java.hibernate.example.association.mapping.part2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab18Client1 {
    public static void main(String[] args) {
        Transaction tx = null;
        try {
            SessionFactory sf = AHibernateUtil.getSessionFactory();
            Session session = sf.openSession();
            tx = session.beginTransaction();

            Student stu = new Student("ritu", "ritu@gmail.com", "111111111");
            session.save(stu);
            Address add = new Address("HMT", "Blore", "KA");
            session.save(add);
            stu.setAddress(add);

            tx.commit();
            session.close();
            AHibernateUtil.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null)
                tx.rollback();
        }
    }
}
