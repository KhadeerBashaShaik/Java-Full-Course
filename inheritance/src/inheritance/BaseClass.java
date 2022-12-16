package inheritance;

public class BaseClass {
int a;
int b;
BaseClass()
{
	System.out.println("base class constructor");
	a=10;
	b=20;
}
public void add()
{
	System.out.println(a+b);
}
}

