package exception_handling;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) throws Exception {
		int m,n,r=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the numbers");
		m=scan.nextInt();
		n=scan.nextInt();
		System.out.println("hello");
		try {
			r=m/n;
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int sum=a+b;
			System.out.println(sum);
		}
		catch(ArithmeticException ae){
			System.out.println(ae.getMessage());
		}
		finally {
			System.gc();
			System.out.println("completing code");
		}
		System.out.println(r);
		System.out.println("welcome");
	    System.out.println(m+n);
	    scan.close();
	}
}
