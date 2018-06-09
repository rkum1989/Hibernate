package com.java.hibernate.example.inheritance.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ALab6 {
    public static void main(String[] args) {
        Transaction tx = null;
        try {
            SessionFactory sf = AHibernateUtil.getSessionFactory();
            Session session = sf.openSession();
            tx = session.beginTransaction();

            //1.adding the student object
            Student stu = new Student("sri", "Blore", "Enabled", 15000.00);
            Integer it1 = (Integer) session.save(stu);
            System.out.println("it1 " + it1.intValue());

            //2.adding CurrentStudent
            CurrentStudent cstu = new CurrentStudent("Vas", "Hyd", "Enabled", 15000.00, 2000.00, "6.30 P.M", "Mathikere");
            Integer it2 = (Integer) session.save(cstu);
            System.out.println("it2 " + it2.intValue());

            //3.adding OldStudent
            OldStudent ostu = new OldStudent("aa", "Blore", "Suspended", 15000.00, "Wipro", "aa@wipro.com", 10.00);
            Integer it3 = (Integer) session.save(ostu);
            System.out.println("it3 " + it3.intValue());

            //4.adding WeekdayStudent
            WeekdayStudent wdstu = new WeekdayStudent("bb", "Hyd", "Disabled", 15000.00, 3000.00, "8.30 A.M", "Mirpur", "B.Tech", "85.50", 2012);
            Integer it4 = (Integer) session.save(wdstu);
            System.out.println("it4 " + it4.intValue());

            //5. adding WeekendStudent
            WeekendStudent westu = new WeekendStudent("cc", "Blore", "Enabled", 15000.00, 4000.00, "3.30 P.M", "HSR", "SDSOFT", "cc@sdsoft.com", 5.0);
            Integer it5 = (Integer) session.save(westu);
            System.out.println("it5 " + it5.intValue());

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
