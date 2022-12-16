package packageModularisation;
import java.util.*;
public class Circle {
private double r;
double getarea()
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the radius");
	r=scan.nextDouble();
	scan.close();
	double x=3.14*r*r;
	return x;
}
}
