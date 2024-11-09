package com.vivek.springboot_transaction_mgmt.dao;

import com.vivek.springboot_transaction_mgmt.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
