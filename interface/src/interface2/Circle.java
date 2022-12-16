package interface2;

public class Circle extends GeometricShape implements Geometry {
	Circle(double radius){
		this.radius=radius;
	}
	public double area() {
		return pi*radius*radius;
	}
	
}
