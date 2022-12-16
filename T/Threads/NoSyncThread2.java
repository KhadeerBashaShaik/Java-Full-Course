package Threads;

public class NoSyncThread2 extends Thread{
	NoSynchronisation t;

	public NoSyncThread2(NoSynchronisation t) {
		this.t=t;
	}
	public void run() {
		t.printTable(100);
	}
}
