package squarearea;
import java.util.*;
public class SquareArea {
static double a;
static double getarea()
{
	return (6*a*a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("enter the length");
a=scan.nextDouble();
scan.close();
double v=getarea();
System.out.println("the reasult is="+v);
	}

}
