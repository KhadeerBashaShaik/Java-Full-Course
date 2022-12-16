package junit_example;

public class Error extends Throwable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String n;
	Error(String n){
		this.n=n;
		
	}
	public String toString() {
		return "Message"+n;
	}

}
