package homeAssignment;

import java.util.Scanner;

public class Utility {
public static int firstadd(int n,int m)
{
	return m+n;
}
public static int secondadd(int x,int y,int z)
{
	return x+y+z;
}
public static int thirdadd(int a[],int n)
{
	int sum=0;
	for(int i=0;i<n;i++)
		sum=sum+a[i];
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
int m,n,x,y,z,q;
int a[]=new int [50];
System.out.println("enter two numbers to add");
m=scan.nextInt();
n=scan.nextInt();
System.out.println("the sum of two elements is="+firstadd(m,n));
System.out.println("enter three numbers to add");
x=scan.nextInt();
y=scan.nextInt();
z=scan.nextInt();
System.out.println("the sum of three elements is="+secondadd(x,y,z));
System.out.println("enter the size of array");
q=scan.nextInt();
System.out.println("enter the array");
for(int i=0;i<q;i++)
	a[i]=scan.nextInt();
System.out.println("the sum of elements in an array is="+thirdadd(a,q));
scan.close();
	}

}
