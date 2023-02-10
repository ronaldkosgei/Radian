package com.Transaction.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "transactions")
public class Transaction{

    public Transaction(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "transaction_code")
    String transactionCode;

    @Column(name = "transaction_date")
    String transactionDate;

    @Column(name = "transaction_time")
    String transactionTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(String time) {
        this.transactionTime = transactionTime;
    }
}
