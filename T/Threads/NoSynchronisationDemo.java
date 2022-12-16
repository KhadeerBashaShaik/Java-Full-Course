package Threads;

public class NoSynchronisationDemo {
	public static void main(String[] args) {
		NoSynchronisation obj = new NoSynchronisation();
		NoSyncThread1 t1 = new NoSyncThread1(obj);
		NoSyncThread2 t2 = new NoSyncThread2(obj);
		t1.start();
		t2.start();
	}
}