package com.wiget.Wiget.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Payment {
   @Id
   private String id;
   @DBRef
   private String user_id;
   @DBRef
   private Orders order_id;
   @DBRef
   private PaymentType paymentType_id;


    public Payment(){}

    public Payment(String id, String user_id, Orders order_id, PaymentType paymentType_id) {
        this.id = id;
        this.user_id = user_id;
        this.order_id = order_id;
        this.paymentType_id = paymentType_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Orders getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Orders order_id) {
        this.order_id = order_id;
    }

    public PaymentType getPaymentType_id() {
        return paymentType_id;
    }

    public void setPaymentType_id(PaymentType paymentType_id) {
        this.paymentType_id = paymentType_id;
    }
}
