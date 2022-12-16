package pg149;

public class HorsePower extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String n;
	HorsePower(String n){
		this.n=n;
	}
	@Override
	public String toString() {
		return "exception raised="+n;
	}
}
