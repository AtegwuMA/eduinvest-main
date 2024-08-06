package com.martins.eduinvest.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Referral {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code; // Unique referral code
    private String status; // Sign-up status

    @ManyToOne
    @JoinColumn(name = "agent_id")
    private Agent agent;

    @OneToOne(mappedBy = "referral")
    private Customer customer; // The customer signed up using this referral
}