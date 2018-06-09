package com.java.hibernate.example.customidgenerator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class SIDGenerator {

    public static String getNextSid() {
        String sid = "JLC-001";
        try {
            SessionFactory sf = AHibernateUtil.getSessionFactory();
            Session session = sf.openSession();
            Transaction tx = session.beginTransaction();

            Query q1 = session.createQuery("from Student stu");
            int size = q1.list().size();
            if (size != 0) {
                Query q = session.createQuery("select max(stu.sid) from Student stu");
                List list = q.list();
                System.out.println(list.size());
                Object o = list.get(0);
                System.out.println(o);
                String id = "";
                id = o.toString();
                String p2 = id.substring(4);
                int x = Integer.parseInt(p2);
                x = x + 1;
                if (x <= 9) {
                    sid = "JLC-00" + x;
                } else if (x <= 99) {
                    sid = "JLC-0" + x;
                } else if (x < 999) {
                    sid = "JLC-" + x;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return sid;
    }
}

