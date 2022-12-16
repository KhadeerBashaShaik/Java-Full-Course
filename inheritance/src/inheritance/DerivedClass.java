package inheritance;

public class DerivedClass extends BaseClass {
int c;
DerivedClass()
{
	System.out.println("Derived class constructor");
	c=100;
}
public int sum()
{
	super.add();
	return a+b+c;
}
public static void main(String args[])
{
	DerivedClass d=new DerivedClass();
	d.add();
	System.out.println(d.sum());
}
}
