package string;
public class StringDemo {
	public static void main(String[] args) {
		String s=new String("hello i am jaya prakash");
		System.out.println(s);
		char [] c= {'a','s','d','c'};
		String s1=new String(c);
		System.out.println(s1);
		String s2=new String(c,1,3);
		System.out.println(s2);
		String s3=new String(s);
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toLowerCase());
		System.out.println(s3.charAt(4));
		String s4=s1+s3;
		System.out.println(s4);
		if(s3.equals(s2))
		    System.out.println("same");
		    else
			System.out.println("not same");
		if(s3.equalsIgnoreCase(s2))
			System.out.println("same");
		else
			System.out.println("not same");
		System.out.println(s.lastIndexOf('a'));
		System.out.println(s.charAt(8));
		System.out.println(s.trim());
		System.out.println(s3.substring(4));
		System.out.println(s3.substring(3, 10));
		System.out.println(s3.isEmpty());
		System.out.println(s3.startsWith("h"));
		System.out.println(s3.endsWith("kash"));
		System.out.println(s3.contains("aya"));
	}
}