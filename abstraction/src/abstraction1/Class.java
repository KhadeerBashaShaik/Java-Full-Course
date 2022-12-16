package abstraction1;
import java.util.Scanner;
public class Class {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int x,y;
		System.out.println("enter two values");
		x=scan.nextInt();
		y=scan.nextInt();
		scan.close();
		Operators o=new Operators(x,y);
		System.out.println("the addition="+o.add(x, y));
		System.out.println("the subtraction="+o.sub(x, y));
		System.out.println("the multiplication="+o.mul(x, y));
		System.out.println("the division="+o.div(x, y));
		System.out.println("the remainder="+o.rem(x, y));
		if(o.isequal(x, y)==true) 
 			System.out.println("both are same");
		else
			System.out.println("both are not same");
		System.out.println("the rightshift="+o.rightshift(x, y));
		System.out.println("the left shift="+o.leftshift(x, y));
	}
}
