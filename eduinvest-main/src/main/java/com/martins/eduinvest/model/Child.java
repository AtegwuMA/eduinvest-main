package com.martins.eduinvest.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
public class Child {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String schoolType; // e.g., Nursery, Primary, Secondary
    private String investmentType; // e.g., WAEC, NECO, JAMB

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    // Additional fields...
    private String schoolName;
    private String schoolAddress;
    private String classType; // e.g., Class 1, Class 2
}
