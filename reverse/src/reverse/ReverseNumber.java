package reverse;
import java.util.Scanner;
public class ReverseNumber {
	private int n;
	private int rev=0;
	public int getsum()
	{
		Scanner scan=new Scanner (System.in);
		System.out.println("enter the number");
		n=scan.nextInt();
		scan.close();
		while(n>0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseNumber v=new ReverseNumber();
		int s=v.getsum();
		System.out.println("the reverse number is="+s);
	}

}
