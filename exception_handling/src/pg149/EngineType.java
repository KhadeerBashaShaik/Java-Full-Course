package pg149;

public class EngineType extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String n;
	EngineType(String n){
		this.n=n;
	}
	@Override
	public String toString() {
		return "exception raised="+n;
	}
}
