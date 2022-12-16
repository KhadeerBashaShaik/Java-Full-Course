package junit_example;

public class Calculatur {
	public static int add(int a,int b) {
		return a+b;
	}
	public static int sub(int a,int b) {
		return a-b;
	}
	public static int mul(int a,int b) {
		return a*b;
	}
	public static double div(double a,double b) {
		if(b==0) {
		try {
			throw new Error("it is not divisible by Zero");
		}
		catch(Error e) {
			System.out.println(e);
		}
		return -1;
	}
		else
			return a/b;
	}
}
