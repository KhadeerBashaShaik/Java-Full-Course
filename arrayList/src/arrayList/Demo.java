package arrayList;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		ArrayList<Integer>il=new ArrayList<Integer>();
		ArrayList <Integer> il1=new ArrayList<Integer>();
		System.out.println("number of elements in list"+il.size());
		il.add(10);
		System.out.println("number of elements in list"+il.size());
		il.add(20);
		System.out.println("number of elements in list"+il.size());
		il.add(30);
		System.out.println("number of elements in list"+il.size());
		System.out.println(il);
		il.remove(0);
		System.out.println(il);
		System.out.println("number of elements in list"+il.size());
		il.add(0,5);
		il.add(20);
		il.add(40);
		System.out.println(il);
		for(int j:il)
		{
			System.out.println(j);
			System.out.println("index ="+il.indexOf(j));
		}
		for(int i=0;i<il.size();i++) {
			il1.add(il.get(i));
		}
		int s=0;
		for(int i=0;i<il1.size();i++)
		{
			s=s+il1.get(i);
		}
		System.out.println("sum="+s);
		il.removeAll(il1);
		System.out.println("number of elements in list="+il1.size());
	}

}
