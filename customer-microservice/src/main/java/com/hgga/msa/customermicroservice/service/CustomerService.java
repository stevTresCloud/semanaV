package com.hgga.msa.customermicroservice.service;

import com.hgga.msa.customermicroservice.entity.CustomerEntity;
import com.hgga.msa.customermicroservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerEntity createCustomer(CustomerEntity customerEntity) {
        return customerRepository.save(customerEntity);
    }

    public CustomerEntity getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    public CustomerEntity updateCustomer(Long id, CustomerEntity customerEntity) {
        customerEntity.setId(id);
        return customerRepository.save(customerEntity);
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

    public List<CustomerEntity> getAllCustomers() {
        return customerRepository.findAll();
    }
}
