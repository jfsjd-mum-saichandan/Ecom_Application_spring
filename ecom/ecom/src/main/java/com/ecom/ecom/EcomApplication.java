package com.ecom.ecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class EcomApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomApplication.class, args);

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Product eProduct = context.getBean("Electronic", Product.class);
		eProduct.productDetails();
		eProduct.productType();

		Product cProduct = context.getBean("Clothing", Product.class);
		cProduct.productDetails();
		cProduct.productType();
		
		Product dProduct = context.getBean("ram", Product.class);
		dProduct.productDetails();
		dProduct.productType();
		
		Product fProduct = context.getBean("raman", Product.class);
		fProduct.productDetails();
		fProduct.productType();
		context.close();

		

	}

}