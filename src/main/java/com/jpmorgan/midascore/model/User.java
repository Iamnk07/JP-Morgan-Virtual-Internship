package com.jpmorgan.midascore.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double balance;

    @OneToMany(mappedBy = "sender")
    private List<TransactionRecord> sentTransactions;

    @OneToMany(mappedBy = "recipient")
    private List<TransactionRecord> receivedTransactions;

    public User() {}

    public User(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public List<TransactionRecord> getSentTransactions() { return sentTransactions; }
    public void setSentTransactions(List<TransactionRecord> sentTransactions) { this.sentTransactions = sentTransactions; }

    public List<TransactionRecord> getReceivedTransactions() { return receivedTransactions; }
    public void setReceivedTransactions(List<TransactionRecord> receivedTransactions) { this.receivedTransactions = receivedTransactions; }
}
