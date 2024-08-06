package com.martins.eduinvest.model;

import com.martins.eduinvest.enums.AgentStatus;
import com.martins.eduinvest.enums.IdentificationType;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
public class Agent extends Person {

    private String location; // Location details
    private String bankName;
    private String accountNumber;
    private IdentificationType identificationType;
    private String idUpload;
    private boolean identityVerified; // Identity verification status

    private AgentStatus agentStatus;
    private Long totalReferrals;
    private String referralCode;
    private Double referralBonus;
    private Double rate;

    @OneToMany(mappedBy = "agent")
    private List<Transaction> transactions;

    @OneToMany(mappedBy = "agent")
    private List<Customer> referrals; // Referrals linked to this agent
    private boolean emailVerified; // Email verification status


}
