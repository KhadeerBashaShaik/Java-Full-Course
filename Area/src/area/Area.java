package area;

public class Area {
static double calculateArea(double r)
{
	return 3.14*r*r;
}
static double calculateArea(double l,double b)
{
	return l*b;
}
static int calculateArea(int s)
{
	return s*s;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r,l,b;
		int  s;
		r=Double.parseDouble(args[0]);
		System.out.println("the circle="+Area.calculateArea(r));
		l=Double.parseDouble(args[1]);
		b=Double.parseDouble(args[2]);
		System.out.println("the rectangle="+Area.calculateArea(l,b));
		s=Integer.parseInt(args[3]);
		System.out.println("the square="+Area.calculateArea(s));
	}

}
