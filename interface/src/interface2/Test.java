package interface2;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the radius");
		double r=scan.nextDouble();
		scan.close();
		Circle c=new Circle(r);
		System.out.println("area ="+c.area());
	}

}
