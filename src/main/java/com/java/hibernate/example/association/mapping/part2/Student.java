//one to one bi-Directional mapping.

package com.java.hibernate.example.association.mapping.part2;

import javax.persistence.*;

@Entity
@Table(name = "students18")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sid")
    private int sid;

    @Column(name = "sname")
    private String sname;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @OneToOne
    @JoinColumn(name = "addid")
    private Address address;

    public Student() {
    }

    public Student(String sname, String email, String phone) {
        super();
        this.sname = sname;
        this.email = email;
        this.phone = phone;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
