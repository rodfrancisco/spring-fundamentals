package com.coderbytrade.repository;

import java.util.List;
import java.util.ArrayList;
import com.coderbytrade.model.Customer;
import com.coderbytrade.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Value;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${dbUsername}")
    private String dbUsername;

    @Override
    public List<Customer> findAll () {
        System.out.println(dbUsername);

        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();

        customer.setFirstname("Rod");
        customer.setLastname("Francisco");

        customers.add(customer);
        return customers;
    }
}
