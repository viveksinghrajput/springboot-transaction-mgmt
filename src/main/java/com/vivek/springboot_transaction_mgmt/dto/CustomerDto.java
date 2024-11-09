package com.vivek.springboot_transaction_mgmt.dto;

import lombok.Data;

@Data
public class CustomerDto {

    private String customerName;
    private String website;
    private String area;
    private String city;
    private String country;
    private String pinCode;
}
