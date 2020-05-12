package com.CHMP.DTO;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "orderDetail")
public class orderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "booking")
    private Date booking;
    @Column(name = "customerID")
    private int customerID;

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(Date booking) {
        this.booking = booking;
    }

    public void setCustomers(int customers) {
        this.customerID = customers;
    }

    public Integer getId() {
        return id;
    }

    public Date getDate() {
        return booking;
    }

    public int getCustomers() {
        return customerID;
    }

    public orderDetail(){}

    public orderDetail(int id,Date booking,int customerID){
        super();
        this.id=id;
        this.booking=booking;
        this.customerID=customerID;
    }
}
