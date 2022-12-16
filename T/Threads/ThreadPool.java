package Threads;
public class ThreadPool implements Runnable{

	private String msg;
	public ThreadPool(String msg) {
		this.msg=msg;
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+"Start Message ="+msg);
		processMethod();
		System.out.println(Thread.currentThread().getName()+"End Message ="+msg);
	}
	private void processMethod() {
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e){
			System.out.println("Exception raised ="+e.getStackTrace());
		}
	}
} 