package factorydesignprocess1;

public class Civil implements Branch{
	public double getsemfee() {
		return 85000;
		
	}
	public double gettotalfee() {
		return 8*this.getsemfee();
	}
}
