package cmd;

public class Student {
static long id;
static String name;
static String gender;
static int m1,m2,m3;
static long mobile;
public static void displayDetails()
{
	System.out.println("student id="+id);
	System.out.println("student name="+name);
	System.out.println("student gender="+gender);
	System.out.println("student marks of subject 1="+m1);
	System.out.println("student marks of subject 2="+m2);
	System.out.println("student marks of subject 3="+m3);
	System.out.println("student mobile number="+mobile);


}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student.id=Long.parseLong(args[0]);
Student.name=(args[1]);
Student.gender=(args[2]);
Student.m1=Integer.parseInt(args[3]);
Student.m2=Integer.parseInt(args[4]);
Student.m3=Integer.parseInt(args[5]); 
Student.mobile=Long.parseLong(args[6]);
Student.displayDetails();  
	}

}
