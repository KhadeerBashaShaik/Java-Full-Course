package mypack;
import java.util.*;
public class Cuboid {
static double l;
static double b;
static double h;
public static double getvolume()
{
	return (l*b*h);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("enter height");
Cuboid.l=scan.nextDouble();
Cuboid.b=scan.nextDouble();
Cuboid.h=scan.nextDouble();
scan.close();
double v=Cuboid.getvolume();
System.out.println("the volume is="+v);
	}

}
