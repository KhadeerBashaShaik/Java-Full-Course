package override;

public class Cuboid extends Rectangle{
double h;
Cuboid(double l,double b,double h)
{
	super(l,b);
	this.l=l;this.b=b; this.h=h;
}
public double area()
{
	return this.l*this.b*this.h;
}
public void display()
{
	super.display();
	System.out.println("rectangle area="+super.area());
	System.out.println("cuboid length="+this.l+"breadth="+this.b+"height="+this.h);
}
}
