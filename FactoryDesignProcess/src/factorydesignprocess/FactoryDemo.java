package factorydesignprocess;
import java.util.*;
public class FactoryDemo {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in)) {
	int x;
	System.out.println("enter\n1.circle\n2.rectangle\n3.square");
	x=scan.nextInt();
	FactoryClass f=new FactoryClass();
	Shape obj=f.getFactory(x);
	obj.draw();
	double a=obj.area();
	System.out.println("area="+a);
}
	}

}
