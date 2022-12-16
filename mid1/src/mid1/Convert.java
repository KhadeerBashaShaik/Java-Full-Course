package mid1;
import java.util.Scanner;
public class Convert {
double kg;
Convert(double kg){
	this.kg=kg;
}
public double toconert()
{
	return kg*2.204;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter no.of kg");
		Scanner sc=new Scanner(System.in);
		double kg=sc.nextDouble();
		sc.close();
		Convert c=new Convert(kg);
		System.out.println("the pounds="+c.toconert());
	}

}
