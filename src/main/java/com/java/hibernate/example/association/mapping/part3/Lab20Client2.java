package com.java.hibernate.example.association.mapping.part3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Set;

public class Lab20Client2 {
    public static void main(String[] args) {
        Transaction tx = null;
        try {
            SessionFactory sf = AHibernateUtil.getSessionFactory();
            Session session = sf.openSession();
            tx = session.beginTransaction();

            Customer cust = (Customer) session.load(Customer.class, 1);
            System.out.println(cust.getCid() + "\t" + cust.getCname() + "\t" + cust.getEmail() + "\t" + cust.getPhone() + "\t" + cust.getDob());
            Set<Order> orders = cust.getOrders();
            System.out.println(orders.getClass().getName());
            for (Order od : orders) {
                System.out.println(od.getOrderId() + "\t" + od.getTotalQty() + "\t" + od.getTotalcost() + "\t" + od.getStatus());
                Order ord = (Order) session.load(Order.class, 2);
                Customer cust2 = ord.getCustomer();
                System.out.println(cust2.getCid() + "\t" + cust2.getCname() + "\t" + cust2.getEmail() + "\t" + cust2.getPhone() + "\t" + cust2.getDob());
            }
            tx.commit();
            session.close();
            AHibernateUtil.shutdown();
        } catch (Exception e) {
            if (tx != null)
                tx.rollback();
        }
    }
}
