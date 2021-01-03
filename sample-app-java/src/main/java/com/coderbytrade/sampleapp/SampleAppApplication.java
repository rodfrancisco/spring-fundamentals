package com.coderbytrade.sampleapp;

import com.coderbytrade.service.CustomerService;
import com.coderbytrade.service.CustomerServiceImpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SampleAppApplication {

	public static void main(String[] args) {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		//CustomerService service = new CustomerServiceImpl();
		CustomerService service = appContext.getBean("customerService", CustomerService.class);
		System.out.println(service);

		System.out.println(service.findAll().get(0).getFirstname());

		//SpringApplication.run(SampleAppApplication.class, args);
	}

}
