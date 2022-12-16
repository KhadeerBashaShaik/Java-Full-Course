package Threads;
class PrintChar implements Runnable
{
	private char charToPrint;
	private int times;
	//constructors
	public PrintChar(char c, int t) 
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
class PrintNum implements Runnable
{
	private int lastNum;
	PrintNum(int n) 
	{ 
	    lastNum = n;
	}
	
//tell thread to how to run
	public void run()
	{
		for (int ii = 1; ii <= lastNum; ii++)
        {
            System.out.print(ii + " ");
	    } //end method run
    } //end class
}
                                
public class TDemo1
{
	public static void main(String[] args) 
	{
		//create tasks
        Runnable printA = new PrintChar('a', 100);
        Runnable printB = new PrintChar('b', 100);
        Runnable print100 = new PrintNum(100);
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