package iinsem1;
import java.util.ArrayList;
public class ShowRoom {
ArrayList<Car>cl=new ArrayList<Car>();
int count=0;
public void addnewcar(long id,String name,String type) {
	cl.add(new Car(id,name,type));
	count++;
}
public void display() {
	for(Car c:cl) {
		System.out.println(count);
		System.out.println(c);
	}
}
}
