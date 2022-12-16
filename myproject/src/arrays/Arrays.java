package arrays;
import java.util.*;
public class Arrays {
private int marks[]=new int [50];
static int n;
private int sum=0;
public int getsum()
{
   for(int i=0;i<n;i++)
	  sum=sum+marks[i];
   return (sum);
}
	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
Arrays a=new Arrays();
System.out.println("enter the no.of students");
n=scan.nextInt();
System.out.println("enter the marks");
for(int i=0;i<n;i++) {
	a.marks[i]=scan.nextInt();
}
scan.close();
int v=a.getsum();
System.out.println("the result is="+v);
	}
}