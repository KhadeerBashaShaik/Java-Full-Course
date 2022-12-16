package interface3;

public class Calculator extends Data implements Arithmetic {
	Calculator(int op1, int op2) {
		super(op1, op2);
	}
	public int add() {
		return op1+op2;
	}
	public int sub() {
		return op1-op2;
	}
	public int mul() {
		return op1*op2;
	}
	public int div() {
		return op1/op2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op1,op2;
		op1=Integer.parseInt(args[0]);
		op2=Integer.parseInt(args[1]);
Calculator c=new Calculator(op1,op2);
System.out.println(c.add());
System.out.println(c.div());
System.out.println(c.mul());
System.out.println(c.sub());
	}

}
