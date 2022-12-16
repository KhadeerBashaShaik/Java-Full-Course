package addition;
import java.util.*;

public class Add {
	 private static int x;
	 private static int y;
	 static
	 {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("enter the numbers");
		 x=scan.nextInt();
		 y=scan.nextInt();
		 scan.close();
	 }
	 public static int getsum()
	 {
		 return x+y;
	 }
	
}
