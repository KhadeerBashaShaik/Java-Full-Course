package methodOverloading;

public class OverloadDemo {

	public static void main(String[] args) {
		Method od=new Method();
		od.test();
		od.test(10);
		od.test(10,20);
		double r=od.test(12.3);
		System.out.println(r);
	}

}
