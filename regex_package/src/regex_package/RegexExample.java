package regex_package;


import java.util.regex.*;

public class RegexExample{
public static void main(String args[]){
//1st way
Pattern p = Pattern.compile(".s");//. represents single character
Matcher m = p.matcher("as");
boolean b1 = m.matches();

//2nd way
boolean b2=Pattern.compile("a.").matcher("as").matches();

//3rd way
boolean b3 = Pattern.matches("a.", "as");

System.out.println(b1+" "+b2+" "+b3);
}
}