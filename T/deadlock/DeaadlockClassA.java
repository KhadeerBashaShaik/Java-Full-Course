package deadlock;

public class DeaadlockClassA {

	public synchronized void methodA(DeadlockClassB b) {
		System.out.println("DeadlockClass A - method A - Thread 1");
		try {
		Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			System.out.println(e.getStackTrace());
		}
		System.out.println("Thread - 1 is calling Thread - 2 From DeadlockClass B Called methodB");
		b.usermethod();
	}
	
	public synchronized void usermethod() {
		System.out.println("in therad 1 class a - usermethod()");
	}
}
