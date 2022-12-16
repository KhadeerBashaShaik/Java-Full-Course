package college;
import java.util.*;
public class College {
private double l;
private double b;
private double h;
College(double l,double b,double h)
{
	this.l=l;
	this.b=b;
	this.h=h;
}
College()
{
	this.l=9.1;
	this.b=2.0;
	this.h=1.98;
}
public double getvolume()
{
	return this.l*this.b*this.h;
}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double l,b,h;
		System.out.println("enter length,breadth and height");
		l=scan.nextDouble();
		b=scan.nextDouble();
		h=scan.nextDouble();
		scan.close();
		College c=new College(l,b,h);
		System.out.println("the volume is="+c.getvolume()); 
		College c1=new College();
		System.out.println("the volume is="+c1.getvolume());
	}
}