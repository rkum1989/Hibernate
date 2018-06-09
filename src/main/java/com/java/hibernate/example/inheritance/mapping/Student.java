package com.java.hibernate.example.inheritance.mapping;

import javax.persistence.*;

@Entity
@Table(name = "mystudents")
@Inheritance(strategy = InheritanceType.JOINED)
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sid")
    private int sid; //p.k

    @Column(name = "sname")
    private String sname;

    @Column(name = "city")
    private String city;

    @Column(name = "status")
    private String status;

    @Column(name = "totalfee")
    private double totalfee;

    public Student() {
    }

    public Student(String sname, String city, String status, double totalfee) {
        super();
        this.sname = sname;
        this.city = city;
        this.status = status;
        this.totalfee = totalfee;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotalfee() {
        return totalfee;
    }

    public void setTotalfee(double totalfee) {
        this.totalfee = totalfee;
    }


}
