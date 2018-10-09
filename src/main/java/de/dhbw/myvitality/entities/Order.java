package de.dhbw.myvitality.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Map;

public class Order {

    private String orderId;

    private LocalDateTime orderDate;

    private float ShipmentCosts;

    private Customer customer;

    private Map<Article, Integer> articles;

    private TypeOfPayment typeOfPayment;

    private String couponNo;

    private boolean TermsAndConditionsConfirmed;

    public Order(String oderId, LocalDateTime orderDate, float shipmentCosts, Customer customer, Map<Article, Integer> articles, TypeOfPayment typeOfPayment, String couponNo, boolean termsAndConditionsConfirmed) {
        this.orderId=orderId;
        this.orderDate = orderDate;
        ShipmentCosts = shipmentCosts;
        this.customer = customer;
        this.articles = articles;
        this.typeOfPayment = typeOfPayment;
        this.couponNo = couponNo;
        TermsAndConditionsConfirmed = termsAndConditionsConfirmed;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public float getShipmentCosts() {
        return ShipmentCosts;
    }

    public void setShipmentCosts(float shipmentCosts) {
        ShipmentCosts = shipmentCosts;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Map<Article, Integer> getArticles() {
        return articles;
    }

    public void setArticles(Map<Article, Integer> articles) {
        this.articles = articles;
    }

    public TypeOfPayment getTypeOfPayment() {
        return typeOfPayment;
    }

    public void setTypeOfPayment(TypeOfPayment typeOfPayment) {
        this.typeOfPayment = typeOfPayment;
    }

    public String getCouponNo() {
        return couponNo;
    }

    public void setCouponNo(String couponNo) {
        this.couponNo = couponNo;
    }

    public boolean isTermsAndConditionsConfirmed() {
        return TermsAndConditionsConfirmed;
    }

    public void setTermsAndConditionsConfirmed(boolean termsAndConditionsConfirmed) {
        TermsAndConditionsConfirmed = termsAndConditionsConfirmed;
    }
}
