package com.java.hibernate.example.customidgenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mystudents36")
public class Student {
    @Id
    @Column(name = "sid")
    private String sid;
    @Column(name = "sname")
    private String sname;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;

    public Student() {
    }


    public Student(String sid, String sname, String email, String phone) {
        super();
        this.sid = sid;
        this.sname = sname;
        this.email = email;
        this.phone = phone;
    }


    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
