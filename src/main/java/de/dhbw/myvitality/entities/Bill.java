package de.dhbw.myvitality.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table
public class Bill {

    @Id
    @GeneratedValue
    @Column
    private String billId;

    @Column
    private List<Order> order;

    @Column
    private float partialPayment;

    @Column
    private LocalDateTime dateOfDelivery;

    @Column
    private String salesTaxId;

    @Column
    private LocalDateTime billDate;

    public Bill() {
    }

    public Bill(List<Order> order, float partialPayment, LocalDateTime dateOfDelivery, String salesTaxId, LocalDateTime billDate) {
        this.order = order;
        this.partialPayment = partialPayment;
        this.dateOfDelivery = dateOfDelivery;
        this.salesTaxId = salesTaxId;
        this.billDate = billDate;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }

    public float getPartialPayment() {
        return partialPayment;
    }

    public void setPartialPayment(float partialPayment) {
        this.partialPayment = partialPayment;
    }

    public LocalDateTime getDateOfDelivery() {
        return dateOfDelivery;
    }

    public void setDateOfDelivery(LocalDateTime dateOfDelivery) {
        this.dateOfDelivery = dateOfDelivery;
    }

    public String getSalesTaxId() {
        return salesTaxId;
    }

    public void setSalesTaxId(String salesTaxId) {
        this.salesTaxId = salesTaxId;
    }

    public LocalDateTime getBillDate() {
        return billDate;
    }

    public void setBillDate(LocalDateTime billDate) {
        this.billDate = billDate;
    }
}
