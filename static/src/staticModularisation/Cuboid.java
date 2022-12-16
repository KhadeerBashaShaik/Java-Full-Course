package staticModularisation;

import java.util.Scanner;

public class Cuboid {
	private static double l;
	private static double b;
	private static double h;
	static
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length,breadth,height");
		l=scan.nextDouble();
		b=scan.nextDouble();
		h=scan.nextDouble();
		scan.close();
		
	}
	public static double getvolume()
	{
		return l*b*h;
	}
}
