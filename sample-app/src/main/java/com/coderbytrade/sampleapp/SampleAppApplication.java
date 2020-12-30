package com.coderbytrade.sampleapp;

import com.coderbytrade.service.CustomerService;
import com.coderbytrade.service.CustomerServiceImpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleAppApplication {

	public static void main(String[] args) {

		CustomerService service = new CustomerServiceImpl();
		System.out.println(service.findAll().get(0).getFirstname());

		//SpringApplication.run(SampleAppApplication.class, args);
	}

}
