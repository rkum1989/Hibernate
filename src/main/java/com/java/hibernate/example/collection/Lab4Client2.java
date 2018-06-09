package com.java.hibernate.example.collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab4Client2 {
    public static void main(String[] args) {
        try {
            SessionFactory sf = AHibernateUtil.getSessionFactory();
            Session session = sf.openSession();
            Transaction tx = session.beginTransaction();

            Student stu = (Student) session.load(Student.class, 3);
            System.out.println(stu.getSid() + "\t" + stu.getSname() + "\t" + stu.getDob());
            for (String cn : stu.getCourses()) {
                System.out.println(cn);
            }
            System.out.println(stu.getEmails());
            System.out.println(stu.getMarks());
            System.out.println(stu.getPhones());
            System.out.println(stu.getRefs());

            tx.commit();
            session.close();
            AHibernateUtil.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
