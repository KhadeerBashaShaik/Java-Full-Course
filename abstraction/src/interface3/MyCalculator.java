package interface3;
import java.util.*;
class MyCalculator implements AdvancedArithmatic {
public int divisor_sum(int n) {
	int s=0;
	for(int i=1;i<=n/2;i++)
	{
		if(n%i==0)
		{
		s=s+i;
		System.out.println(i);
	}
	}
	return s;
}
public static void main(String []args) {
	MyCalculator m=new MyCalculator();
	int n;
	System.out.println("enter the number");
	Scanner scan=new Scanner(System.in);
	n=scan.nextInt();
	scan.close();
	System.out.println("the divisor sum="+m.divisor_sum(n));
    }
} 