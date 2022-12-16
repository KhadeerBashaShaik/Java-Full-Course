package singletonstudent;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student x=Student.getInstance();
Student y=Student.getInstance();
Student z=Student.getInstance();
System.out.println(x.id);
System.out.println(x.branch);
System.out.println(x.name);
System.out.println(y.id);
System.out.println(y.branch);
System.out.println(y.name);
System.out.println(z.id);
System.out.println(z.branch);
System.out.println(z.name);
System.out.println(x.hashCode());
System.out.println(y.hashCode());
System.out.println(z.hashCode());
	}

}
