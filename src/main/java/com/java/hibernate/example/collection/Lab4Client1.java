package com.java.hibernate.example.collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.*;

public class Lab4Client1 {
    public static void main(String[] args) {
        try {
            SessionFactory sf = AHibernateUtil.getSessionFactory();
            Session session = sf.openSession();
            Transaction tx = session.beginTransaction();

            String[] cous = {"Java", "JDBC", "Jsp", "Servlet"};

            List<String> ems = new ArrayList<String>();
            ems.add("aa@jlc.com");
            ems.add("bb@jlc.com");
            ems.add("cc@jlc.com");

            List<Integer> maks = new ArrayList<Integer>();
            maks.add(new Integer(100));
            maks.add(new Integer(90));
            maks.add(new Integer(99));

            Set<Long> phs = new HashSet<Long>();
            phs.add(new Long(1111));
            phs.add(new Long(2222));
            phs.add(new Long(3333));

            Map<String, Long> refs = new HashMap<String, Long>();
            refs.put("aaa", new Long(444));
            refs.put("aaa", new Long(555));
            refs.put("aaa", new Long(666));

            Student stu = new Student("Sri", "10-10-10", "M.Sc", cous, ems, maks, phs, refs);
            session.save(stu);

            tx.commit();
            session.close();
            AHibernateUtil.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}