package exception_handling;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int age;
		System.out.println("enter the age");
		age=scan.nextInt();
		if(age<18) {
		try {
			if(age<18)
				throw new MyException("invalid age to cast vote");
		}
		catch(MyException me) {
			System.out.println(me);
		}
		finally {
			scan.close();
		}
		}
		else
		System.out.println("you can check");
	}

}
