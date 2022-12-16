package factorydesignprocess;
import java.util.*;
public class FactoryClass {
public Shape getFactory(int choice) {
	try (Scanner scan = new Scanner(System.in)) {
		if(choice==1) {
			double r=scan.nextDouble();
			return (new Circle(r));
		}
		else if(choice==2) {
			double l,b;
			l=scan.nextDouble();
			b=scan.nextDouble();
			return (new Rectangle(l,b));
		}
		else if(choice==3) {
			double s;
			s=scan.nextDouble();
			return (new Square(s));
		}
		else
			return null;
	}
}
}
