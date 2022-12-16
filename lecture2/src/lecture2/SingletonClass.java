package lecture2;

public class SingletonClass {
private int x,y;
private SingletonClass() {
	this.x=10;
	this.y=20;
}
private static SingletonClass obj1;
public static SingletonClass getObject() {
	if(obj1==null) {
		obj1=new SingletonClass();
	}
	return obj1;
}
public void setXY(int x,int y) {
	this.x=x;
	this.y=y;
}
public String toString() {
	return String.format("x= %d\ny= %d\n",x,y);
}
}
