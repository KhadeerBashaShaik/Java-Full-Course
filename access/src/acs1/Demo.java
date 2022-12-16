package acs1;
import access.Cuboid;
public class Demo {

	public static void main(String[] args) {
		Cuboid c=new Cuboid();
		c.l=10.3;
		c.b=2.5;
		c.h=1.23;
		System.out.println("the volume is="+c.getsum());
	}

}