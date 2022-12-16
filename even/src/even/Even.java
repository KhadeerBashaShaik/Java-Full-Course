package even;

import java.util.Scanner;

public class Even {
private int n;
public int getsum()
{
	return n%2;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
Even e=new Even();
System.out.println("enter the  number");
e.n=scan.nextInt();
scan.close();
int v=e.getsum();
if(v==0)
	System.out.println("this is even number");
else
	System.out.println("this is odd number");
	}

}
