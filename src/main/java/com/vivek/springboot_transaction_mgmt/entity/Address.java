package com.vivek.springboot_transaction_mgmt.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long addressId;
    private String area;
    private String city;
    private String country;
    private String pinCode;
    @OneToOne
    private Customer customer;
}
