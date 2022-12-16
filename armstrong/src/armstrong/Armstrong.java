package armstrong;
import java.util.*;
public class Armstrong {
private int n;
public boolean getsum()
{
	Scanner scan=new Scanner (System.in);
	System.out.println("enter the number");
	n=scan.nextInt();
	int a=n;
	double sum=0;
	scan.close();
	int x=(int) (Math.log10(n)+1);
	while(n>0) {
		int r=n%10;
		sum=sum+Math.pow(r, x);
		n=n/10;
	}
	if(sum==a)
		return true;
	else
		return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Armstrong a=new Armstrong();
		if(a.getsum()==true)
			System.out.println("Armstrong number");
		else
			System.out.println("not armstrong");
	}

}
