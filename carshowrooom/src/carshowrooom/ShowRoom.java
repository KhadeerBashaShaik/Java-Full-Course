package carshowrooom;
import java.util.*;
public class ShowRoom {
	ArrayList <Car> cl=new ArrayList<Car>();
	static int count =0;
	public void addcar(String regno,String carMake,String carModel,int yop,String colour,int eid,String etyp,int hpw,float ew)
	{
		Engine e=new Engine(eid,etyp,hpw,ew);
		cl.add(new Car(regno,carMake,carModel,yop,colour,e));
		count++;
	}
public void displaycars() 
{
	for(Car c:cl)
	{
		System.out.println(c);
		System.out.println("number of cars="+count);
	}
}
}