package de.dhbw.myvitality.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
@Entity
public class Bill {
    @Id
    @GeneratedValue
    private String billId;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "bill_order_id")
    private List<Ordering> ordering;

    private float partialPayment;

    private LocalDateTime dateOfDelivery;

    private String salesTaxId;

    private LocalDateTime billDate;

    public Bill() {
    }

    public Bill(List<Ordering> ordering, float partialPayment, LocalDateTime dateOfDelivery, String salesTaxId, LocalDateTime billDate) {
        this.ordering = ordering;
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

    public List<Ordering> getOrdering() {
        return ordering;
    }

    public void setOrdering(List<Ordering> ordering) {
        this.ordering = ordering;
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
