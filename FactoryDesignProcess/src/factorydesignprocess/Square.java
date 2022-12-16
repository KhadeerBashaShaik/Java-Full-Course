package factorydesignprocess;

public class Square implements Shape{
double s;
Square(double s){
	this.s=s;
	
}
public void draw() {
	System.out.println("drawing square");
	
}
public double area() {
	return s*s;
}
}
