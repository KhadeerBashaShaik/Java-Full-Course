package Threads;
class PrintChar1 implements Runnable
{
	private char charToPrint;
	private int times;
	//constructors
	public PrintChar1(char c, int t) 
	{
       charToPrint =c;
        times =t; 
	}
	public void run()
	{
        for (int i = 1; i <= times; i++)
        {
            System.out.print(charToPrint + " "); 
        }
    }
}//end class

//Create a TaskClass called PrintNum for printing numbers from 1 to n for a given n
class PrintNum1 implements Runnable
{
	private int lastNum;
	PrintNum1(int n) 
	{ 
	    lastNum = n;
	    Thread.yield();
	}
	
//tell thread to how to run
	public void run()
	{
		try
	    {
		    for (int i = 0; i < lastNum; i++)
		    {
		        System.out.print(" " + i);
	            if (i >= 50)
                {
                    Thread.sleep(1000);
                }
		    }  
	    }   //end try block
	    catch(Exception e)
	    {
	    } //end method run
    } //end class
}
                                
public class TDemo2
{
	public static void main(String[] args) 
	{
		//create tasks
        Runnable printA = new PrintChar1('a', 100);
        Runnable printB = new PrintChar1('b', 100);
        Runnable print100 = new PrintNum1(100);
        //create threads run tasks
        Thread t1 = new Thread(printA);
        Thread t2 = new Thread(printB);
        Thread t3 = new Thread(print100);
        //start threads
        t1.start();
       
        t2.start();
        t3.start();
	}
}
