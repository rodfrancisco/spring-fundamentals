package com.coderbytrade.sampleapp;

import com.coderbytrade.repository.CustomerRepository;
import com.coderbytrade.repository.HibernateCustomerRepositoryImpl;
import com.coderbytrade.service.CustomerService;
import com.coderbytrade.service.CustomerServiceImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"com.coderbytrade"})
@PropertySource("application.properties")
public class AppConfig {
    
    @Bean
    public static PropertySourcesPlaceholderConfigurer gPropertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
    
    //@Bean(name = "customerService")
    //public CustomerService getCustomerService() {
    //    CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
    //    CustomerServiceImpl service = new CustomerServiceImpl();
    //
    //    service.setCustomerRepository(getCustomerRepository());
    //    return service;
    //}

    //@Bean(name = "customerRepository")
    //public CustomerRepository getCustomerRepository() {
    //    return new HibernateCustomerRepositoryImpl();
    //}
}
