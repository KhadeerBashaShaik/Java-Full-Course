package geometricshape;

public class Circle extends GeometricShape {
	double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setBorderColour(String bordercolour) {
		this.bordercolour=bordercolour;
	}
	public void setFilled(boolean filled) {
		this.filled=filled;
	}
	public String toString() {
		return ("circle is created with radius="+this.getRadius()+"border colour="+this.bordercolour+"filled="+this.filled);
	}

}
