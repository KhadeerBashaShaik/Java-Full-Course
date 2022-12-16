package Threads;
public class NoSynchronisation {
	synchronized public void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
				
			}
			catch(InterruptedException e) {
				System.out.println(e.getStackTrace());
			}
		}
	}
}