package utility;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner scan=new Scanner(System.in)){
		int n,i,l,small;
		int a[];
		System.out.println("enter array size");
		n=scan.nextInt();
		a=new int [n];
		System.out.println("enter array");
		for(i=0;i<n;i++)
			a[i]=scan.nextInt();
		scan.close();
		Utility.sort(a);
		l=Utility.findLargest(a);
		System.out.println("largest element="+l);
		small=Utility.findSmallest(a);
		System.out.println("smallest element="+small); 
		}
	}
}
