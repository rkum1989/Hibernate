package com.java.hibernate.example.association.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab16Client2 {
    public static void main(String[] args) {
        Transaction tx = null;
        try {
            SessionFactory sf = AHibernateUtil.getSessionFactory();
            Session session = sf.openSession();
            tx = session.beginTransaction();

            Student stu = (Student) session.load(Student.class, 1);
            System.out.println(stu.getSid() + "\t" + stu.getSname() + "\t" + stu.getEmail() + "\t" + stu.getPhone());
            Address add = stu.getAddress();
            System.out.println(add.getAddid() + "\t" + add.getStreet() + "\t" + add.getCity() + "\t" + add.getState());

            Address add1 = (Address) session.load(Address.class, 1);
            System.out.println(add1.getAddid() + "\t" + add1.getStreet() + "\t" + add1.getCity() + "\t" + add1.getState());

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
