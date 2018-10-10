package de.dhbw.myvitality.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
@Entity
public class TypeOfPayment {

    @Id
    @GeneratedValue
    private String typeId;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "type_method_id")
    private List<PaymentMethod> paymentMethods;

    private String paymentEmail;
    @OneToOne
    @JoinColumn(name = "type_preferred_account_id")
    private Bank preferredAccount;

    private String cardNo;

    private LocalDate expirationDate;

    public TypeOfPayment() {
    }

    public List<PaymentMethod> getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public String getPaymentEmail() {
        return paymentEmail;
    }

    public void setPaymentEmail(String paymentEmail) {
        this.paymentEmail = paymentEmail;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
}
