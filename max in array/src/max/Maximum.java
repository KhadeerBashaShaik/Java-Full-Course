 package max;
import java.util.*;
public class Maximum {
int a []=new int [40];
public int getmax()
{
	try (Scanner scan = new Scanner(System.in)) {
		int n,i,m; 
		System.out.println("enter size of array");
		n=scan.nextInt();
		System.out.println("enter the array");
		for(i=0;i<n;i++)
			a[i]=scan.nextInt();
		System.out.println("the array is");
		for(i=0;i<n;i++)
			System.out.println(a[i]);
		m=0;
		for(i=0;i<n;i++)
		{
			if(m<a[i])
				m=a[i];
		}
		scan.close();
	
	return m;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Maximum m=new Maximum();
int v=m.getmax();
System.out.println("the max is="+v);
	}

}
