package interface1;

public class InterfaceDemo implements Myinterface {
	public void print() {
		System.out.println("this is first interface");
	}
	public void display() {
		System.out.println("Display methos");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceDemo i=new InterfaceDemo();
		i.display();
		i.print();
	}

}
