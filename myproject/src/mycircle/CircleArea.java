package mycircle;
import java.util.*;
public class CircleArea {
private double pi;
private double r;
public double getarea()
{
	return (pi*r*r);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
CircleArea c=new CircleArea();
System.out.println("enter the pi value");
c.pi=scan.nextDouble();
System.out.println("enter the r value");
c.r=scan.nextDouble();
scan.close();
double s=c.getarea();
System.out.println("the result is="+s);
	}

}
