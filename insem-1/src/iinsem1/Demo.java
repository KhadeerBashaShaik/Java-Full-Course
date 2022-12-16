package iinsem1;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in)) {
			String name;
			long mob;
			int x;
			Person p=new Person();
			String choice;
			do {
				System.out.println("1.add new person\n 2.display");
				x=scan.nextInt();
				switch(x) {
				case 1:
					System.out.println("enter name");
					name=scan.next();
					System.out.println("enter mob.no");
					mob=scan.nextLong();
					p.newperson(name,mob);
					break;
				case 2:
					p.display();
					break;
					default:
						System.out.println("invalid choice");
						break;
						
				}
				System.out.println("do you want to continue");
				choice=scan.next();
			}
			while(choice!="no");
		}
	}
}
