package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICustomerServices customerServices = context.getBean("service",ICustomerServices.class);
		 
		customerServices.add();
		
		context.close();
	}

}
