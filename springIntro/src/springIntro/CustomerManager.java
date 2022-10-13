package springIntro;

public class CustomerManager implements ICustomerServices {
	
	private ICustomerDal customerDal;
	
	//constructor injection
	//public CustomerManager(ICustomerDal customerDal) {
		//this.customerDal = customerDal;
	//}
	
	// setter injection
	public void setCustomerDal(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		// i� kurallar�
		customerDal.add();
	}
	
	public void remove() {
		customerDal.remove();
	}

}
