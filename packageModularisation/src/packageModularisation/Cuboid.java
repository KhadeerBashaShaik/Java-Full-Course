package packageModularisation;
import java.util.*;
public class Cuboid {
	private double l;
	private double b;
	private double h;
	public double getvolume()
	{
	 Scanner scan=new Scanner(System.in);
	 System.out.println("enter the length,breadth and heigth");
	 l=scan.nextDouble();
	 b=scan.nextDouble();
	 h=scan.nextDouble();
	 scan.close();
	 double y=l*b*h;
	 return y;	 
	}
	
}
