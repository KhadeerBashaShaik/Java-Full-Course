package abstraction1;

public class Operators extends Data implements Arithmetic,Bitwise,Relational {
Operators(int a, int b) {
		super(a,b);
	}
public int add(int a,int b) {
	return a+b;
}
public int sub(int a,int b) {
	return a-b;
}
public int mul(int a,int b) {
	return a*b;
}
public int div(int a,int b) {
	return a/b;
}
public int rem(int a,int b) {
	return a%b;
}
public int xor(int a,int b) {
	return a^b;
}
public int leftshift(int a ,int b) {
	return a<<b;
}
public int rightshift(int a,int b) {
	return a>>b;
}
public boolean lessThan(int a,int b){
	if(a<b)
		return true;
	else
		return false;
}
public boolean greaterThan(int a,int b) {
	if(a>b)
		return true;
	else
		return false;
}
public boolean isequal(int a,int b) {
if(a==b)
	return true;
else
	return false;
}
}
