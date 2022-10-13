package springIntro;

public class OracleCustomerDal implements ICustomerDal{
	
	String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public void add() {		
		System.out.println("Connection String : "+this.connectionString);
		System.out.println("Oracle veritabanýna eklendi");
	}

	public void remove() {
		System.out.println("Oracle veritabanýndan silindi");
	}
}
