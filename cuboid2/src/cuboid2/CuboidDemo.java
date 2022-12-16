package cuboid2;
import java.util.*;
public class CuboidDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Cuboid2 obj1=new Cuboid2();
		if(obj1.setL(scan.nextDouble())&&obj1.setB(scan.nextDouble())&&obj1.setH(scan.nextDouble()))
		{
			System.out.println(obj1);
		}
		else
			System.out.println("enter valid input");
		scan.close();
	}
}