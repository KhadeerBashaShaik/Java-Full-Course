package exception_handling;

public class MyException extends Exception {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
String msg;
MyException(String msg){
	this.msg=msg;
}
public String toString() {
	return "exception raised:"+msg;
}
}
