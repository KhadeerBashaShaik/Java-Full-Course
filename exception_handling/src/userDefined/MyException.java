package userDefined;

public class MyException extends Exception{
	String n;
	MyException(String n){
		this.n=n;
	}
	public String toString() {
		return "Exception raised="+n;
	}
}
