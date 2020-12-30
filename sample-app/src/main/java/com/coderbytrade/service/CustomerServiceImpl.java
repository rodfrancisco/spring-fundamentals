package com.coderbytrade.service;


import java.util.List;
import com.coderbytrade.model.Customer;
import com.coderbytrade.repository.CustomerRepository;
import com.coderbytrade.repository.HibernateCustomerRepositoryImpl;
import com.coderbytrade.service.CustomerService;


public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
