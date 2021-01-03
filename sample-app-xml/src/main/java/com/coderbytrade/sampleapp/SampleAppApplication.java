package com.coderbytrade.sampleapp;

import com.coderbytrade.service.CustomerService;
import com.coderbytrade.service.CustomerServiceImpl;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SampleAppApplication {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService service = appContext.getBean("customerService", CustomerService.class);
		
		System.out.println(service.findAll().get(0).getFirstname());

		//SpringApplication.run(SampleAppApplication.class, args);
	}

}
