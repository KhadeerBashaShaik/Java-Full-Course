package pg149;

public class EngineID extends Exception{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
String n;
EngineID(String n){
	this.n=n;
}
@Override
public String toString() {
	return "exception raised="+n;
}

}
