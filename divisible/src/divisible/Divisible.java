package divisible;

import java.util.Scanner;

public class Divisible {
private static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("enter the number");
n=scan.nextInt();
scan.close();
if(n%3==0&&n%5==0)
	System.out.println("it is divisible by both 3 and 5");
else if(n%3!=0&&n%5==0)
	System.out.println("it is only divisible by 5");
else if(n%3==0&&n%5!=0)
	System.out.println("it is only divisible by 3");
else
	System.out.println("it is not divisible by both 3 and 5");
	}

}
