package com.java.hibernate.example.custom.hibernatetemplatewithdaolayer;

public class HibernateCustomerDAO implements CustomerDAO {

    @Override
    public int addCustomer(CustomerTO cto) {
        Customer cust = new Customer(cto.getCname(), cto.getEmail(), cto.getPhone(), cto.getCity(), cto.getStatus());
        Integer it = (Integer) HibernateTemplate.saveObject(cust);
        return it.intValue();
    }

    @Override
    public void updateCustomer(CustomerTO cto) {
        Customer cust = new Customer(cto.getCid(), cto.getCname(), cto.getEmail(), cto.getPhone(), cto.getCity(), cto.getStatus());
        HibernateTemplate.updateObject(cust);
    }

    @Override
    public void deleteCustomer(int cid) {
        HibernateTemplate.deleteObject(Customer.class, cid);

    }

    @Override
    public CustomerTO getCustomerByCid(int cid) {
        Customer cust = (Customer) HibernateTemplate.loadObject(Customer.class, cid);
        CustomerTO cto = new CustomerTO(cust.getCid(), cust.getCname(), cust.getEmail(), cust.getPhone(), cust.getCity(), cust.getStatus());

        return cto;
    }

}
