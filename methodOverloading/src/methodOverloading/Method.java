package methodOverloading;

public class Method {
void test()
{
	System.out.println("no parameters");
}
void test(int a)
{
	System.out.println("a="+a);
}
void test(int a,int b)
{
	System.out.println("a="+a+"b="+b);
}
double test(double a)
{
	return a*a;
}
}
