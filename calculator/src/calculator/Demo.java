package calculator;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double x=scan.nextDouble();
		double y=scan.nextDouble();
		double z=scan.nextDouble();
		Point3D p=new Point3D(x,y,z);
		System.out.println(p);
		scan.close();
	}

}
