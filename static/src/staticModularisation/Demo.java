package staticModularisation;

public class Demo {
	public static void main(String[] args)
	{
		double a,z,i;
		a=Circle.getarea();
		z=Triangle.gettriangle();
		System.out.println("area of circle is="+a);
		System.out.println("Area of triangle is="+z);
		i=Cuboid.getvolume();
		System.out.println("volume is="+i);
	}
}