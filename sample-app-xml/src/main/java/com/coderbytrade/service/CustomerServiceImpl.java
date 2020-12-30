package com.coderbytrade.service;

import java.util.List;
import com.coderbytrade.model.Customer;
import com.coderbytrade.repository.CustomerRepository;


public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;
    
    public CustomerServiceImpl() {        
    }

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;        
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
}
