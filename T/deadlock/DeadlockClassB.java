package deadlock;

public class DeadlockClassB {

	public synchronized void usermethod() {
		System.out.println("DeadlockClass B - method B - Thread 2");
	}
	public synchronized void methodB(DeaadlockClassA a) {
		System.out.println("Thread 2 is in method B ");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("in thread -2 calling thread 1 in method A");
		a.usermethod();
	}
}
