package com.java.hibernate.example.inheritance.mapping.part3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ostudents4")
public class OldStudent extends Student {
    @Column(name = "ocompany")
    private String ocompany;
    @Column(name = "ocemail")
    private String ocemail;
    @Column(name = "octc")
    private double octc;

    public OldStudent() {
    }

    public OldStudent(String sname, String city, String status, double totalfee,
                      String ocompany, String ocemail, double octc) {
        super(sname, city, status, totalfee);
        this.ocompany = ocompany;
        this.ocemail = ocemail;
        this.octc = octc;
    }

    public String getOcompany() {
        return ocompany;
    }

    public void setOcompany(String ocompany) {
        this.ocompany = ocompany;
    }

    public String getOcemail() {
        return ocemail;
    }

    public void setOcemail(String ocemail) {
        this.ocemail = ocemail;
    }

    public double getOctc() {
        return octc;
    }

    public void setOctc(double octc) {
        this.octc = octc;
    }


}
