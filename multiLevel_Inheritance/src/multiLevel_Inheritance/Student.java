package multiLevel_Inheritance;

public class Student extends Man{
long rno;
String branch;
Student(long uid, String name,int age,double h,long rno,String branch){
	this.age=age;
	this.branch=branch;
	this.height=h;
	this.name=name;
	this.rno=rno;
	this.uid=uid;
}
}
