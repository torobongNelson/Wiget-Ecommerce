package com.wiget.Wiget.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Orders {
    @Id
    private String id;
    @DBRef
    private Users user_id;
    @DBRef
    private Product product_id;
    @DBRef
    private Inventory quantity;
    private double totalAmount;
    private Date orderedAt;

    public Orders(){}
    public Orders(String id, Users user_id, Product product_id, Inventory quantity, double totalAmount, Date orderedAt) {
        this.id = id;
        this.user_id = user_id;
        this.product_id = product_id;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
        this.orderedAt = orderedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Users getUser_id() {
        return user_id;
    }

    public void setUser_id(Users user_id) {
        this.user_id = user_id;
    }

    public Product getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Product product_id) {
        this.product_id = product_id;
    }

    public Inventory getQuantity() {
        return quantity;
    }

    public void setQuantity(Inventory quantity) {
        this.quantity = quantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getOrderedAt() {
        return orderedAt;
    }

    public void setOrderedAt(Date orderedAt) {
        this.orderedAt = orderedAt;
    }
}
