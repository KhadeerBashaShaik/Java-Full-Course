package abstraction;

public class Sum extends Method {
public int sum(int a,int b){
	return a+b;
}
public int sum(int a,int b,int c) {
	return a+b+c;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum s=new Sum();
		System.out.println(s.sum(10, 20));
		System.out.println(s.sum(10, 20, 30));
	}

}
