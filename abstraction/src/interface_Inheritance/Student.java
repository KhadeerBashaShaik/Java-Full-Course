package interface_Inheritance;
public class Student implements Interface2{
	long id;
	String name;
	int rank;
	Student(long id,String name,int rank){
		this.id=id;
		this.name=name;
		this.rank=rank;
	}
	public void display() {
	System.out.println("Student id="+this.id);
	System.out.println("Student name="+this.name);
	}
	public void print() {
		System.out.println("Student rank="+this.rank);
	}
	public static void main(String []args) {
		Student s=new Student(2100030494,"khadeer",1);
		s.display();
		s.print();
	}
}