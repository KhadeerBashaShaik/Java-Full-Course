package calculator;

public class Point3D extends Point2D{
private double z;
Point3D(double x,double y,double z){
	super(x,y);
	this.z=z;
}
public double getZ() {
	return z;
}
public void setZ(double z) {
	this.z = z;
}

public String toString() {
	
	return "Point2D ="+super.toString()+ "[z=" + z + "]";
}

}
