package constructor;
import java.util.*;
public class Constructor {
private long id;
private String name;
private int rank;
Scanner scan;
Constructor()
{
	scan=new Scanner(System.in);
	System.out.println("enter id");
	id=scan.nextLong();
	System.out.println("enter name");
	name=scan.next();
	System.out.println("enter rank");
	rank=scan.nextInt();
	scan.close();
}
public String toString()
{
	return ("Student id="+this.id+"\nname="+this.name+"\nrank="+this.rank);
}
	public static void main(String[] args) {
		Constructor c=new Constructor();
		System.out.println(c);
	}
}
