package calculator;

import java.util.Scanner;

public class Calculator {
private int x,y;
private String s;
public int getsum(String s)
{
	switch(s)
	{
	case "+":
		return x+y;
	case "-":
		return x-y;
	case "*":
		return x*y;
	case "/":
		return x/y;
	}
	return 0;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
Calculator c=new Calculator();
System.out.println("enter the numbers");
c.x=scan.nextInt();
c.y=scan.nextInt();
System.out.println("enter the symbol");
c.s=scan.next();
scan.close();
int v=c.getsum(c.s);
System.out.println("the result is="+v);

	}

}
