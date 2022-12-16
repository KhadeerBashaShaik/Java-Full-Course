package factorydesignprocess1;

public class Cse implements Branch{

public double getsemfee() {
	return 85000;
	
}
public double gettotalfee() {
	return 8*this.getsemfee();
}
}
