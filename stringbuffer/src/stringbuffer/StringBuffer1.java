package stringbuffer;

import java.util.Scanner;

public class StringBuffer1 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		StringBuffer s=new StringBuffer();
		System.out.println(s.capacity());
		StringBuffer s1=new StringBuffer("hello");
		System.out.println(s1.capacity());
		System.out.println(s1);
		s1.ensureCapacity(5000);
		System.out.println(s1.capacity());
		String a="jaya_prakash";
		StringBuffer s2=new StringBuffer(a);
		System.out.println(s2);
		System.out.println(s2.capacity());
		System.out.println(s2.length());
		System.out.println(s2);
		System.out.println(s2.reverse());
		System.out.println(s2.reverse());
		System.out.println(s2.replace(0, 4, "piro"));
		s2.delete(0, 5);
		System.out.println(s2);
		String b=scan.next();
		StringBuffer s3=new StringBuffer(b);
		System.out.println(s3);
		s3.delete(1, 3);
		System.out.println(s3);
		scan.close();
	}
}
