package abstraction;
public class Hr extends Employee {
	Hr(long id, String name, double salary, String performance) {
		super(id, name, salary, performance);
	}
	public void print() {
		super.display();
		System.out.println("Employee salary=" + super.salary);
		System.out.println("Employee performance=" + super.performance);
	}
	public static void main(String[] args) {
		Hr h = new Hr(123, "xyz", 37800, "A");
		h.print();
	}
}