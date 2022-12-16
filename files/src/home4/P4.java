package home4;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class P4 {
	public static void main(String []args) throws IOException {
	long id;
	String name;
	long mob;
	int age;
	Scanner scan=new Scanner(System.in);
	FileWriter f=new FileWriter("sec-1.txt",true);
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
	File f1=new File("sec-1.txt");
	Scanner s1=new Scanner(f1);
	FileWriter f2=new FileWriter("reg.txt",true);
	while (s1.hasNextLine()){
		String d=s1.nextLine();
		f2.write(d+"\n");
	}
	System.out.println("Copying data from prevoius file.....");
	File f3=new File("reg.txt");
	Scanner s3=new Scanner(f3);
	while(s3.hasNextLine()) {
		String d1=s3.nextLine();
		System.out.println(d1+"\n");
	}
	s3.close();
	f.close();
	s1.close();
	f2.close();
	scan.close();
}
}
