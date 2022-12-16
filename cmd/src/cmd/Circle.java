package cmd;

public class Circle {
private double r;
public double getsum()
{
	return 3.14*r*r;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle();
		Circle c2=new Circle();
	    c1.r=Double.parseDouble(args[0]);
	    c2.r=Double.parseDouble(args[1]);
	    System.out.println("the area of 1st circle is="+c1.getsum());
	    System.out.println("the area of 2nd circle is="+c2.getsum());
	}

}
