package com.CHMP.DTO;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private float price;
    @Column(name = "inStock")
    private boolean inStock;
    @Column(name = "commentID")
    private int commentID;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public boolean getInStock() {
        return inStock;
    }

    public int getComments() {
        return commentID;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public void setComments(int commentsID) {
        this.commentID = commentsID;
    }

    public product(){}

    public product(int id,String name,float price,boolean inStock,int commentsID){
        super();
        this.id=id;
        this.name=name;
        this.price=price;
        this.inStock=inStock;
        this.commentID=commentsID;
    }
}
