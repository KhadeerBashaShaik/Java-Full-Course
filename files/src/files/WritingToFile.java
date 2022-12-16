package files;
import java.io.*;
import java.io.FileWriter;
import java.util.*;
public class WritingToFile {
	public static void main(String[] args) throws IOException{
		long id;
		String name;
		long mob;
		int age;
		Scanner scan=new Scanner(System.in);
		FileWriter f=new FileWriter("reg.txt",true);
		System.out.println("enter student id");
		id=scan.nextLong();
		System.out.println("enter name");
		name=scan.next();
		System.out.println("enter mobile number");
		mob=scan.nextLong();
		System.out.println("enter age");
		age=scan.nextInt();
		f.write(id+" "+name+" "+mob+" "+age+"\n");
		System.out.println("writing succesfull");
		f.close();
		scan.close();
	}
}