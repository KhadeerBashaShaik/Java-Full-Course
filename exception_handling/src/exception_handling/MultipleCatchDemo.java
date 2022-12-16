package exception_handling;
public class MultipleCatchDemo {

	public static void main(String[] a) {
		int sum=0;float avg=0;
		try {
			sum=Integer.parseInt(a[0]+a[1]+a[2]+a[3]);
			avg=sum/Integer.parseInt(a[4]);
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException abe) {
			System.out.println(abe.getMessage());
		}
		finally {
			System.gc();
		}
		System.out.println(avg);
	}

}
