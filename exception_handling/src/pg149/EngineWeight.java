package pg149;

public class EngineWeight extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String n;
	EngineWeight(String n){
		this.n=n;
	}
	@Override
	public String toString() {
		return "exception raised="+n;
	}
}
