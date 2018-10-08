package de.dhbw.myvitality.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table
public class TypeOfPayment {

    @Id
    @GeneratedValue

    @Column
    private List<PaymentMethod> type;

    @Column
    private String paymentEmail;

    @Column
    private Bank bank;

    @Column
    private String cardNo;

    @Column
    private LocalDate expirationDate;
}
