package com.java.hibernate.example.basics;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cid")
    private int cid;

    @Column(name = "cname")
    private String cname;

    @Column(name = "email")
    private String email;

    @Column(name = "city")
    private String city;

    @Column(name = "phone")
    private long phone;


    public Customer() {
    }

    public Customer(String cname, String email, String city, long phone) {
        super();
        this.cname = cname;
        this.email = email;
        this.city = city;
        this.phone = phone;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

}
