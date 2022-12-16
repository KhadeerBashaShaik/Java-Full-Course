package table1;

public class MethodOverload {
int s;
double r;
MethodOverload(int s, double r) {
	this.s = s;
	this.r = r;
}
public void area(int s) {
	int a=s*s;
	System.out.println("area of square="+a);
}
public void area(double r) {
	double x=3.14*r*r;
	System.out.println("area of circle="+x);
}
}

