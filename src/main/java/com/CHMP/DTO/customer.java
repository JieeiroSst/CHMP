package com.CHMP.DTO;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "customer")
public class customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "customerSice")
    private Date customerSice;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getCustomerSine() {
        return customerSice;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCustomerSine(Date customerSice) {
        this.customerSice = customerSice;
    }

    public customer(){}
    public customer(int id,String name,Date customerSice){
        super();
        this.id=id;
        this.name=name;
        this.customerSice=customerSice;
    }
}
