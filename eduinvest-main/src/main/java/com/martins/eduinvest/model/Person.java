package com.martins.eduinvest.model;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@MappedSuperclass
@Data
public abstract class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String password; // Hash this in practice
    private Date dob;
    private String address;

    // Additional common properties...
    private boolean google2FAEnabled;
}