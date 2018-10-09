package de.dhbw.myvitality.entities;

import java.time.LocalDate;
import java.util.List;

public class TypeOfPayment {

    private List<PaymentMethod> type;

    private String paymentEmail;

    private Bank bank;

    private String cardNo;

    private LocalDate expirationDate;

    public TypeOfPayment(List<PaymentMethod> type, String paymentEmail, Bank bank, String cardNo, LocalDate expirationDate) {
        this.type = type;
        this.paymentEmail = paymentEmail;
        this.bank = bank;
        this.cardNo = cardNo;
        this.expirationDate = expirationDate;
    }

    public TypeOfPayment() {
    }

    public List<PaymentMethod> getType() {
        return type;
    }

    public void setType(List<PaymentMethod> type) {
        this.type = type;
    }

    public String getPaymentEmail() {
        return paymentEmail;
    }

    public void setPaymentEmail(String paymentEmail) {
        this.paymentEmail = paymentEmail;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
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
