package factorydesignprocess;

public class Circle implements Shape{
double r;
Circle(double r){
	this.r=r;
}
public void draw() {
	System.out.println("drawing circle");
}
public double area() {
	return 3.14*r*r;
}
}
