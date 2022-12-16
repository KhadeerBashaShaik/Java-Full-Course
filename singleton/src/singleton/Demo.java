package singleton;
public class Demo {
	public static void main(String[] args) {
		Employee e1=Employee.getInstance();
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.salary);
		Employee e2=Employee.getInstance();
		System.out.println(e2.id);
	}
}
