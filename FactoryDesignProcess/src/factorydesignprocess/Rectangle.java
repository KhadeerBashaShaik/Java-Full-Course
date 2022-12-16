package factorydesignprocess;

public class Rectangle implements Shape{
double l,b;
Rectangle(double l,double b){
	this.b=b;
	this.l=l;
}
public void draw() {
	System.out.println("drawing rectangle");
	
}
public double area() {
	return l*b;
}
}
