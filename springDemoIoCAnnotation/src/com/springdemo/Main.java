package com.springdemo;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(IocConfig.class);
		//context.refresh();
		ICustomerServices customerServices = context.getBean("service",ICustomerServices.class);
		 
		customerServices.add();
		
		context.close();
	}

}
