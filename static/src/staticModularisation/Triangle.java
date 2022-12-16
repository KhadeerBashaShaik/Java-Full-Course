package staticModularisation;
import java.util.*;
public class Triangle {
	private static double x;
	private static double y;
static
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the height and base");
	x=scan.nextDouble();
	y=scan.nextDouble();
	scan.close();
}
public static double gettriangle()
{
	return 0.5*x*y;
}
	
}
