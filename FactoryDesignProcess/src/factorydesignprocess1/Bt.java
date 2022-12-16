package factorydesignprocess1;

public class Bt implements Branch{
public double getsemfee() {
	return 85000;
	
}
public double gettotalfee() {
	return 8*this.getsemfee();
}
}
