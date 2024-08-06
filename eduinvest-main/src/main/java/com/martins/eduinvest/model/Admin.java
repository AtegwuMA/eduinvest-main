package com.martins.eduinvest.model;
import com.martins.eduinvest.enums.AdminRole;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Data
public class Admin extends Person {

    @Column(unique = true)
    private String superAdminEmail;

    private AdminRole adminRole;

    @OneToMany(mappedBy = "admin")
    private List<Agent> agents;

    @OneToMany(mappedBy = "admin")
    private List<Product> products;

    @OneToMany(mappedBy = "transaction")
    private List<Transaction> transaction;

    @OneToMany(mappedBy = "customer")
    private List<Customer> customers;
}