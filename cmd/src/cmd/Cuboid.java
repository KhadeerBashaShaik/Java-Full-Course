
package cmd;

public class Cuboid {
public double l,b,h;
public double getsum()
{
	return l*b*h;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cuboid c1=new Cuboid();
Cuboid c2=new Cuboid();
c1.l=Double.parseDouble(args[0]);
c1.b=Double.parseDouble(args[1]);
c1.h=Double.parseDouble(args[2]);
c2.l=Double.parseDouble(args[3]);
c2.b=Double.parseDouble(args[4]);
c2.h=Double.parseDouble(args[5]);
System.out.println("the volume of 1st cuboid is="+c1.getsum());
System.out.println("the volume of 2nd cuboid is="+c2.getsum());
	}

}
