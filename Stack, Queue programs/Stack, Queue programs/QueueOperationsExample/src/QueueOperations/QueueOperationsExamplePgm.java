package QueueOperations;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueOperationsExamplePgm {

	public static void main(String[] args) {
				  
		        //Creating a Queue
		        Queue<String> pq = new PriorityQueue<>();

		         //adding values into Queue
		        pq.add("Lakshmi");
		        pq.add("Nagalakshmi");
		        pq.add("Mahalakshmi");
		        System.out.println(pq);

		        // removing an element 
		        pq.remove("Nagalakshmi");
		        System.out.println("After Remove " + pq);
		        System.out.println("Poll Method " + pq.poll());
		        System.out.println("Final Queue " + pq);
		        // Iterating over the Queue
		        Iterator iterator = pq.iterator();
		        while (iterator.hasNext()) {
		        	System.out.print(iterator.next() + " ");

		}
	}
}

