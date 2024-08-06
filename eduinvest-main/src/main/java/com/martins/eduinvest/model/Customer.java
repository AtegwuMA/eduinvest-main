package com.martins.eduinvest.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
public class Customer extends Person {

    private String address;

    @OneToMany(mappedBy = "customer")
    private List<Child> children;

    @OneToMany(mappedBy = "customer")
    private List<Transaction> transactions;

    // Additional fields...
}