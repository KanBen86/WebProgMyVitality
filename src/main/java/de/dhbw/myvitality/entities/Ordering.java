package de.dhbw.myvitality.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * Entityklasse für die Bestellungen
 * @author Fabian Lieb
 */
@Entity
public class Ordering {

    //Felder der Klasse

    @Id
    @GeneratedValue
    private String orderId;

    private LocalDateTime orderDate;

    private float ShipmentCosts;

    @OneToOne
    @JoinColumn(name = "ordering_customer_id")
    private Customer customer;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "ordering_position_id")
    private List<Position> position;

    @OneToOne
    @JoinColumn(name = "ordering_payment_type_id")
    private TypeOfPayment typeOfPayment;

    private String couponNo;

    private boolean TermsAndConditionsConfirmed;

    //Konstruktoren

    public Ordering() {
    }

    public Ordering(LocalDateTime orderDate, float shipmentCosts, Customer customer, List<Position> position, TypeOfPayment typeOfPayment, String couponNo, boolean termsAndConditionsConfirmed) {
        this.orderDate = orderDate;
        ShipmentCosts = shipmentCosts;
        this.customer = customer;
        this.position = position;
        this.typeOfPayment = typeOfPayment;
        this.couponNo = couponNo;
        TermsAndConditionsConfirmed = termsAndConditionsConfirmed;
    }

    //Getter & Setter

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

    public List<Position> getPosition() {
        return position;
    }

    public void setPosition(List<Position> position) {
        this.position = position;
    }
}
