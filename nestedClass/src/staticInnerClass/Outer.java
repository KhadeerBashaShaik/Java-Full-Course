package staticInnerClass;

public class Outer {
static int outerx;
static
{
	outerx=20;
}
static class Inner{
	static int innerx;
	static {
		innerx=30;
	}
	static void display()
	{
		System.out.println(outerx);
		System.out.println(innerx);
	}
}
}