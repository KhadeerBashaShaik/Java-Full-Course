package Threads;

public class NoSyncThread1 extends Thread {
	NoSynchronisation t;
	public NoSyncThread1(NoSynchronisation t) {
		this.t=t;
	}
	public void run() {
		t.printTable(5);
	}
}