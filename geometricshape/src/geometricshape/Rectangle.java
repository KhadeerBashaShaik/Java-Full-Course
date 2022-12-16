package geometricshape;

public class Rectangle extends GeometricShape {
double length;
double width;
public double getLength() {
	return length;
}
public void setLength(double length) {
	this.length = length;
}
public double getWidth() {
	return width;
}
public void setWidth(double width) {
	this.width = width;
}
public String getBorderColour() {
	return bordercolour;
}
public void setBorderColour(String bordercolour)
{
	this.bordercolour=bordercolour;
}
public void setFilled(boolean filled)
{
	this.filled=filled;
}
public String toString()
{
	return ("rectangle is created with length"+this.getLength()+"width"+this.getWidth()+"border colour"+this.getBorderColour()+"filled="+this.filled);
}
}
