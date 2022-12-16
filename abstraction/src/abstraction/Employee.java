package abstraction;
/*write an abstract class that contains basic details of employee namely name and emp id and with a concrete method
to display it to include another abstract method signature to display confidential details*/
public abstract class Employee {
long id;
String name;
double salary;
String performance;
Employee(long id,String name,double salary,String performance){
	this.id=id;
	this.name=name;
	this.performance=performance;
	this.salary=salary;
}
public void display() {
	System.out.println("Employee id="+this.id);
	System.out.println("Employee name+"+this.name);
}
public abstract void print();
}
