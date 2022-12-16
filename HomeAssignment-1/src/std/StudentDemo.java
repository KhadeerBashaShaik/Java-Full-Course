package std;
import homeAssignment.Student;
import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the id number");
		Student.id=scan.nextLong();
		System.out.println("enter the marks of three subjects");
		Student.m1=scan.nextDouble();
		Student.m2=scan.nextDouble();
		Student.m3=scan.nextDouble();
		scan.close();
		System.out.println("student id="+Student.id);
		System.out.println("marks of first subject are="+Student.m1+"\nsecond subject="+Student.m2+"\nthird subject"+Student.m3);
		System.out.println("the total is="+Student.getsum());
	}

}
