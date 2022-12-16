package singleton;
import java.util.*;
public class Employee {
static Employee e=new Employee();
long id;
String name;
double salary;
private Employee() {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter id");
	id=scan.nextLong();
	System.out.println("enter name"); 
	name=scan.next();
	System.out.println("enter salary");
	salary=scan.nextDouble();
	scan.close();
}
public static Employee getInstance() {
	return e;
}
}