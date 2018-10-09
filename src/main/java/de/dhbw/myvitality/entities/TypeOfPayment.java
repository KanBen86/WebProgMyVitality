package de.dhbw.myvitality.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

public class TypeOfPayment {

    private List<PaymentMethod> type;

    private String paymentEmail;

    private Bank bank;

    private String cardNo;

    private LocalDate expirationDate;
}
