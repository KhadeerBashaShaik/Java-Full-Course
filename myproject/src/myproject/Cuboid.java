package myproject;
import java.util.*;
public class Cuboid {
	private double length;
	private double height;
	private double breadth;
	public double getvolume()
	{
		return (length*breadth*height);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Cuboid c=new Cuboid();
		System.out.println("enter the length");
		c.length=scan.nextDouble();
		System.out.println("enter the breadth");
		c.breadth=scan.nextDouble();
		System.out.println("enter the height");
		c.height=scan.nextDouble();
		scan.close();
		double v=c.getvolume();
		System.out.println("volume of cuboid is:"+v);
		
	}

}
