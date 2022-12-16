package factorydesignprocess1;

import java.util.Scanner;

public class DEmo {
public static void main(String [] args) {
	try (Scanner scan = new Scanner(System.in)) {
		int c;
		System.out.println("1.bt\n2.civil\n3.cse");
		c=scan.nextInt();
		FactoryBranch f=new FactoryBranch();
		Branch obj=f.getFactory(c);
		double x=obj.gettotalfee();
		System.out.println("total fee="+x);
	}
}
}
