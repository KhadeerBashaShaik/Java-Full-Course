package regex_package;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Regex1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string you want to compare");
		String s=scan.next();
		System.out.println("enter original string");
		String s1=scan.next();
		Pattern pat=Pattern.compile(s);
		Matcher mat=pat.matcher(s1);
		if(mat.find()==true) {
			System.out.println("both are same");
		}
		else
			System.out.println("both are not same");
		scan.close();
	}

}
