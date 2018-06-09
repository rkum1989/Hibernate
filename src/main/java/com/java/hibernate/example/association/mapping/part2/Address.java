//one to one bi-Directional mapping.

package com.java.hibernate.example.association.mapping.part2;

import javax.persistence.*;

@Entity
@Table(name = "addresses18")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "addid")
    private int addid;

    @Column(name = "street")
    private String street;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @OneToOne
    @JoinColumn(name = "addid")
    private Student student;

    public Address() {
    }

    public Address(String street, String city, String state) {
        super();
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public int getAddid() {
        return addid;
    }

    public void setAddid(int addid) {
        this.addid = addid;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }


}
