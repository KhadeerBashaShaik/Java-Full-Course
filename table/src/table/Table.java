package table;

import java.util.Scanner;

public class Table {
int n;
	public void getTable(){
Scanner scan=new Scanner(System.in);
System.out.println("enter the number");
n=scan.nextInt();
scan.close();
int i,r;
for(i=1;i<=10;i++)
{
	r=n*i;
	System.out.println(n+"*"+i+"="+r); 
}
	}

}