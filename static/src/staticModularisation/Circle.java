package staticModularisation;
import java.util.Scanner;
public class Circle {
private static double r;
static 
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the radius");
	r=scan.nextDouble();
	scan.close();
}
public static double getarea()
{
	return 3.14*r*r;
}
}