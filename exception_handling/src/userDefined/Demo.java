package userDefined;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long n;
		int x=0;
		System.out.println("enter the number");
		n=scan.nextLong();
		while(n>0) {
			x++;
			n=n/10;
		}
		if(x!=10) {
		try {
			if(x!=10)
				throw new MyException("wrong number");
			
			}
		catch(MyException me) {
			System.out.println(me);
		}
		finally {
			scan.close();
		}
		}
		else
			System.out.println("it has 10 digits");
		
	}

}
