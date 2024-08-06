package com.martins.eduinvest.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double amount;
    private String status; // e.g., Pending, Paid
    private String paymentMethod; // e.g., Paystack, Bank Transfer
    private String proofOfPaymentUrl; // URL for proof of payment image or document

    @ManyToOne
    @JoinColumn(name = "agent_id")
    private Agent agent;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    // Additional properties if needed...
}
