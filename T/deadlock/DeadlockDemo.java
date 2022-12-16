package deadlock;

public class DeadlockDemo  implements Runnable{
	
	public void run() {
		a.methodA(b);
	}
	DeaadlockClassA a=new DeaadlockClassA();
	DeadlockClassB b=new DeadlockClassB();
	
	DeadlockDemo(){
		Thread t=new Thread(this);
		t.start();
		b.methodB(a);
	}
	
	
	public static void main(String [] args) {
		new DeadlockDemo();		
	}
}
