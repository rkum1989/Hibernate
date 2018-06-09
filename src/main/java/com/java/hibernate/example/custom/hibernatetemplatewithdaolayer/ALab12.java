package com.java.hibernate.example.custom.hibernatetemplatewithdaolayer;

public class ALab12 {
    public static void main(String[] args) {
        CustomerDAO cdao = DAOFactory.getCustomerDAO();

        //1.Add Customer
        CustomerTO cto1 = new CustomerTO(1, "AA", "aa@jlc", 11111111, "AP", "Enabled");
        cdao.addCustomer(cto1);

        //2.Get Customer
        CustomerTO cto2 = cdao.getCustomerByCid(1);
        System.out.println(cto2.getCid() + "\t" + cto2.getCname() + "\t" + cto2.getEmail() + "\t" + cto2.getPhone() + "\t" + cto2.getCity() + "\t" + cto2.getStatus());

/*//4.Update Customer
CustomerTO cto3=cdao.getCustomerByCid(1);
cto3.setCname("RR");
cto3.setEmail("rr@gmail.com");
cto3.setPhone(9999999);
cdao.updateCustomer(cto3);

//3.Delete Customer
cdao.deleteCustomer(3);
*/
    }
}
