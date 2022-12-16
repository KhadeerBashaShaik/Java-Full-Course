package homeAssignment;

public class Utilitycmd {
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
int m,n,x,y,z,q;
int a[]=new int [50];
m=Integer.parseInt(args[0]);
n=Integer.parseInt(args[1]);
System.out.println("the sum of two elements is="+firstadd(m,n));
x=Integer.parseInt(args[2]);
y=Integer.parseInt(args[3]);
z=Integer.parseInt(args[4]);
System.out.println("the sum of three elements is="+secondadd(x,y,z));
q=Integer.parseInt(args[5]);
for(int i=0;i<q;i++)
	a[i]=Integer.parseInt(args[6]);
System.out.println("the sum of elements in an array is="+thirdadd(a,q));
	}

}
