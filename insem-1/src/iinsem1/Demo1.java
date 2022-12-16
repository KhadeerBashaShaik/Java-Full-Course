package iinsem1;
import java.util.*;
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowRoom s=new ShowRoom();
		try (Scanner scan = new Scanner(System.in)) {
			long id;
			String n,t;
			int x;
			while(true) {
				System.out.println("1.add new car\n2.display\n3.exit");
				x=scan.nextInt();
				switch(x) {
				case 1:
					System.out.println("enter id,car name and type");
					id=scan.nextLong();
					n=scan.next();
					t=scan.next();
					s.addnewcar(id, n, t);
					break;
				case 2:
					s.display();
					break;
				case 3:
					System.exit(0);
					break;
				default:
					System.out.println("invalid choice");
				}
			}
		}
	}

}
