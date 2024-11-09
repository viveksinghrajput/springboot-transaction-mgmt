package com.vivek.springboot_transaction_mgmt.dao;

import com.vivek.springboot_transaction_mgmt.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
}
