package com.springdemo;

public class CustomerManager implements ICustomerServices {
	
	private ICustomerDal customerDal;
	
	//constructor injection
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	

	public void add() {
		// iþ kurallarý
		customerDal.add();
	}
	
	public void remove() {
		customerDal.remove();
	}

}
