package circlearea;
import java.util.*;
public class Area {
private static double r;
static
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the radius");
	r=scan.nextDouble();
	scan.close();
}
public static double getarea()
{
	return 3.14*r*r;
}
}
