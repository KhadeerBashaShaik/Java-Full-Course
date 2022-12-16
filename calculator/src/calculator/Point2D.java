package calculator;

public class Point2D {
private double x;
private double y;
Point2D(double y, double x){
	this.x=x;
	this.y=y;
}
public double getX() {
	return x;
}
public void setX(double x) {
	this.x = x;
}
public double getY() {
	return y;
}
public void setY(double y) {
	this.y = y;
}
public String toString() {
	return "Point2D [x=" + x + ", y=" + y + "]";
}

}
