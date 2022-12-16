package genericdemo;
import java.util.*;
public class Demo {

	public static void main(String []args) {
		List <String>arrayL=new ArrayList();
		List <Integer>LinkedL=new LinkedList<Integer>();
		List<String> Vec=new Vector();
		List<String> stack=new Stack();
		arrayL.add("hi");
		arrayL.add("hello");
		System.out.println("ArrayList= "+arrayL);
		LinkedL.add(6);
		LinkedL.add(8);	
		LinkedL.add(7);
		System.out.println("Linked list= "+LinkedL);
		Iterator <String> it=arrayL.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Collections.sort(LinkedL);
		System.out.println(LinkedL);
		
	}
	
}
