package com.coderbytrade.repository;

import java.util.List;
import com.coderbytrade.model.Customer;

public interface CustomerRepository {

    List<Customer> findAll();

}
