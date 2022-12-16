package table1;
import java.util.*;
public class Demo {
public static void main(String []args) {
	Scanner scan=new Scanner(System.in);
	int x=scan.nextInt();
	double z=scan.nextDouble();
	MethodOverload m=new MethodOverload(x,z);
	m.area(z);
	m.area(x);
}
}
