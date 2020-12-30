package com.coderbytrade.repository;

import java.util.List;
import java.util.ArrayList;
import com.coderbytrade.model.Customer;
import com.coderbytrade.repository.CustomerRepository;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll () {
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();

        customer.setFirstname("Rod");
        customer.setLastname("Francisco");

        customers.add(customer);
        return customers;
    }
}
