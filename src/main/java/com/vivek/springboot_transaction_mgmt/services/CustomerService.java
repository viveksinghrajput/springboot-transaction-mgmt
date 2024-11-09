package com.vivek.springboot_transaction_mgmt.services;

import com.vivek.springboot_transaction_mgmt.dao.AddressRepository;
import com.vivek.springboot_transaction_mgmt.dao.CustomerRepository;
import com.vivek.springboot_transaction_mgmt.dto.CustomerDto;
import com.vivek.springboot_transaction_mgmt.entity.Address;
import com.vivek.springboot_transaction_mgmt.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    AddressRepository addressRepository;

    @Transactional(propagation=Propagation.REQUIRED)
    public String saveCustomer(CustomerDto customerDto){
        Customer customer= new Customer();
        customer.setName(customerDto.getCustomerName());
        customer.setUrl(customerDto.getWebsite());
        Customer dbCustomer = customerRepository.save(customer);

        //Address address= new Address();
        Address address= null;
        address.setArea(customerDto.getArea());
        address.setCity(customerDto.getCity());
        address.setCountry(customerDto.getCountry());
        address.setPinCode(customerDto.getPinCode());
        address.setCustomer(dbCustomer);
        Address dbAddress = addressRepository.save(address);
        return  "Customer saved Successfully : "+dbCustomer.getId();
    }
}
