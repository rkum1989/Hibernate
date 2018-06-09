package com.java.hibernate.example.collection;

import javax.persistence.*;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Entity
@Table(name = "students2")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sid")
    private int sid; //p.k

    @Column(name = "sname")
    private String sname;

    @Column(name = "dob")
    private String dob;

    @Column(name = "quali")
    private String qualification;

    @ElementCollection
    @JoinTable(name = "courses", joinColumns = @JoinColumn(name = "sid"))
    @OrderColumn
    @Column(name = "cname")
    private String[] courses;

    @ElementCollection
    @JoinTable(name = "emails", joinColumns = @JoinColumn(name = "sid"))
    @OrderColumn
    @Column(name = "emailId")
    private List<String> emails;

    @ElementCollection
    @JoinTable(name = "marks", joinColumns = @JoinColumn(name = "sid"))
    @OrderColumn
    @Column(name = "marks")
    private List<Integer> marks;

    @ElementCollection
    @JoinTable(name = "phones", joinColumns = @JoinColumn(name = "sid"))
    @Column(name = "phoneNo")
    private Set<Long> phones;

    @ElementCollection
    @JoinTable(name = "refs", joinColumns = @JoinColumn(name = "sid"))
    @Column(name = "rphone")
    private Map<String, Long> refs;

    public Student() {
    }

    public Student(String sname, String dob, String qualification,
                   String[] courses, List<String> emails, List<Integer> marks,
                   Set<Long> phones, Map<String, Long> refs) {
        super();
        this.sname = sname;
        this.dob = dob;
        this.qualification = qualification;
        this.courses = courses;
        this.emails = emails;
        this.marks = marks;
        this.phones = phones;
        this.refs = refs;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    public Set<Long> getPhones() {
        return phones;
    }

    public void setPhones(Set<Long> phones) {
        this.phones = phones;
    }

    public Map<String, Long> getRefs() {
        return refs;
    }

    public void setRefs(Map<String, Long> refs) {
        this.refs = refs;
    }


}
