package com.springboot.springsecurityapp.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transaction_details")
public class TransactionDetailsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "transaction_id")
    private int transactionId;
    @Column(name = "account_number")
    private String accountNumber;
    @Column(name = "transaction_number")
    private String transactionNumber;
    @Column(name = "transaction_description")
    private String discription;
    @Column(name = "transaction_date")
    private String transactionDate;

    public TransactionDetailsModel() {
    }

    public TransactionDetailsModel(String accountNumber, String transactionNumber, String discription, String transactionDate) {
        this.accountNumber = accountNumber;
        this.transactionNumber = transactionNumber;
        this.discription = discription;
        this.transactionDate = transactionDate;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    @Override
    public String toString() {
        return "TransactionDetailsModel{" +
                "transactionId=" + transactionId +
                ", accountNumber='" + accountNumber + '\'' +
                ", transactionNumber='" + transactionNumber + '\'' +
                ", discription='" + discription + '\'' +
                ", transactionDate=" + transactionDate +
                '}';
    }
}
