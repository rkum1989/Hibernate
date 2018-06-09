package com.java.hibernate.example.custom.hibernatetemplatewithdaolayer;

public interface CustomerDAO {

    public int addCustomer(CustomerTO cto);

    public void updateCustomer(CustomerTO cto);

    public void deleteCustomer(int cid);

    public CustomerTO getCustomerByCid(int cid);

}
