package com.java.hibernate.example.version;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cid")
    private int cid;

    @Column(name = "cname")
    private String cname;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private Long phone;

    @Version
    private int version;

    public Customer() {
    }

    public Customer(String cname, String email, Long phone) {
        super();
        this.cname = cname;
        this.email = email;
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

    public Long getPhone() {
        return phone;
    }


    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }


}
