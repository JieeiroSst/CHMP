package com.CHMP.DTO;

import javax.persistence.*;

@Entity
@Table(name = "orderLine")
public class orderLine {
    @Column(name = "productID")
    private int productID;
    @Column(name = "orderDetailID")
    private int orderDetailID;
    @Column(name = "amount")
    private int amount;
    @Column(name = "purchasePrice")
    private float purchasePrice;

    public int getProducts() {
        return productID;
    }

    public int getOrderDetailID() {
        return orderDetailID;
    }

    public int getAmount() {
        return amount;
    }

    public float getPurchasePrice() {
        return purchasePrice;
    }

    public void setProducts(int productID) {
        this.productID = productID;
    }

    public void setOrderDetailID(int orderDetailID) {
        this.orderDetailID = orderDetailID;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public orderLine(){}
    public orderLine(int productID, int amount,float purchasePrice){
        super();
        this.productID=productID;
        this.amount=amount;
        this.purchasePrice=purchasePrice;
    }
}
