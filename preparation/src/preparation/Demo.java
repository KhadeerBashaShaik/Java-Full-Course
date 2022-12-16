package preparation;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library l=new Library();
		long id;
		String name;
		String author;
		int yop;
		int y;
		int c;
		try(Scanner scan=new Scanner(System.in)){
		int x;
		do {
			System.out.println("1.add book\n2.search by bid");
			x=scan.nextInt();
			switch(x) {
			case 1:
				System.out.println("enter id");
				id=scan.nextLong();
				System.out.println("enter name");
				name=scan.next();
				System.out.println("enter author");
				author=scan.next();
				System.out.println("enter yop");
				yop=scan.nextInt();
				l.addBook(id, name, author, yop);
				break;
			case 2:
				System.out.println("enter the bid to search");
				y=scan.nextInt();
				l.search(y);
				break;
			}
			System.out.println("do you want to continue 1.continue 2.exit");
			c=scan.nextInt();
		}
			while(c!=2);
		
		}
	}

}
