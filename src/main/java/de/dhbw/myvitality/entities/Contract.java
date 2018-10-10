package de.dhbw.myvitality.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
public class Contract {
    @Id
    @GeneratedValue
    private String contractId;

    private String deliveryConditions;

    private String paymentConditions;

    private String qualityRequirements;

    private LocalDate contractPeriod;

    private float priceClause;

    private LocalDateTime noticePeriod;

    private int minimalOrderSize;

    public Contract() {
    }

    public Contract(String deliveryConditions, String paymentConditions, String qualityRequirements, LocalDate contractPeriod, float priceClause, LocalDateTime noticePeriod, int minimalOrderSize) {
        this.deliveryConditions = deliveryConditions;
        this.paymentConditions = paymentConditions;
        this.qualityRequirements = qualityRequirements;
        this.contractPeriod = contractPeriod;
        this.priceClause = priceClause;
        this.noticePeriod = noticePeriod;
        this.minimalOrderSize = minimalOrderSize;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getDeliveryConditions() {
        return deliveryConditions;
    }

    public void setDeliveryConditions(String deliveryConditions) {
        this.deliveryConditions = deliveryConditions;
    }

    public String getPaymentConditions() {
        return paymentConditions;
    }

    public void setPaymentConditions(String paymentConditions) {
        this.paymentConditions = paymentConditions;
    }

    public String getQualityRequirements() {
        return qualityRequirements;
    }

    public void setQualityRequirements(String qualityRequirements) {
        this.qualityRequirements = qualityRequirements;
    }

    public LocalDate getContractPeriod() {
        return contractPeriod;
    }

    public void setContractPeriod(LocalDate contractPeriod) {
        this.contractPeriod = contractPeriod;
    }

    public float getPriceClause() {
        return priceClause;
    }

    public void setPriceClause(float priceClause) {
        this.priceClause = priceClause;
    }

    public LocalDateTime getNoticePeriod() {
        return noticePeriod;
    }

    public void setNoticePeriod(LocalDateTime noticePeriod) {
        this.noticePeriod = noticePeriod;
    }

    public int getMinimalOrderSize() {
        return minimalOrderSize;
    }

    public void setMinimalOrderSize(int minimalOrderSize) {
        this.minimalOrderSize = minimalOrderSize;
    }
}


