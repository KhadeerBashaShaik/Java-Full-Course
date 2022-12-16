package override;

public class Rectangle {
double l;
double b;
Rectangle(double l,double b){
	this.l=l;
	this.b=b;
}
public double area()
{
	return l*b;
}
public void display()
{
	System.out.println("rectangle length="+this.l+"breadth="+this.b+"area="+this.area());
}
}
