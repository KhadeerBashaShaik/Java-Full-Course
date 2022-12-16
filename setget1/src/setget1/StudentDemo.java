package setget1;
import java.util.*;
public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s=new Student();
Scanner scan=new Scanner(System.in);
System.out.println("enter student id");
long id=scan.nextLong();
s.setSid(id);
System.out.println("enter student name");
String name=scan.next();
s.setName(name);
System.out.println("enter student rank");
int r=scan.nextInt();
s.setRank(r);
System.out.println("enter student age");
int a=scan.nextInt();
if(s.setAge(a)==false)
	System.out.println("invalid age");
scan.close();
System.out.println("student id="+s.getSid());
System.out.println("student name="+s.getName());
System.out.println("student rank="+s.getRank());
System.out.println("student age="+s.getAge());
System.out.println(s);
	}

}
