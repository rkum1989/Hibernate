package com.java.hibernate.example.association.mapping.part3;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "orderId")
    private int orderId;

    @Column(name = "totalQty")
    private int totalQty;

    @Column(name = "totalcost")
    private Double totalcost;

    @Column(name = "orderDate")
    private Date orderDate;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "cid", referencedColumnName = "cid")
    private Customer customer;

    public Order() {
    }

    public Order(int totalQty, Double totalcost, Date orderDate, String status) {
        super();
        this.totalQty = totalQty;
        this.totalcost = totalcost;
        this.orderDate = orderDate;
        this.status = status;
    }


    public int getOrderId() {
        return orderId;
    }


    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }


    public int getTotalQty() {
        return totalQty;
    }


    public void setTotalQty(int totalQty) {
        this.totalQty = totalQty;
    }


    public Double getTotalcost() {
        return totalcost;
    }


    public void setTotalcost(Double totalcost) {
        this.totalcost = totalcost;
    }


    public Date getOrderDate() {
        return orderDate;
    }


    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
