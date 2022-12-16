package myFirstProgram;
import java.util.*;
public class HelloProgram {

	public static void main(String[] args) {
		try(Scanner scan =new Scanner(System.in)){
			System.out.println("enter the string");
		String s=scan.nextLine();
		scan.close();
		Input1 i=new Input1();
		Input1 i1=new Input1(s);
		if(s.equals(" "))
			System.out.println(i);
		else
		System.out.println(i1);
		
		}
	}
}