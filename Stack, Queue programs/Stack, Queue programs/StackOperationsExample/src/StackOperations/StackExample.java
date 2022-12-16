package StackOperations;
import java.util.Iterator;
import java.util.Stack;


public class StackExample 
{
	public static void main(String[] args)   
	{  
	  
		Stack<Integer> stk= new Stack<Integer>();  
		boolean result = stk.isEmpty();  
		System.out.println("Is the stack empty? " + result);  
	
		stk.push(78);  
		stk.push(113);  
		stk.push(90);  
		stk.push(120);  
		//prints elements of the stack  
		System.out.println("Elements in Stack: " + stk); 
		//peek element
		System.out.println("Top element in stack: "+ stk.peek());
		//Pop element
		System.out.println("Pop top element:"+stk.pop());
		//Printing all elements from the stack
		System.out.println(stk.firstElement());
		System.out.println("Stack elements:");
		Iterator<Integer> iterator = stk.iterator();  
		while(iterator.hasNext())  
		{  
			System.out.println(iterator.next());  
		}     
		result = stk.isEmpty();  
		System.out.println("Is the stack empty? " + result);  
	}   
}
