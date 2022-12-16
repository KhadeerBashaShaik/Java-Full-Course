package singletonstudent;

public class Student {
long id;
String name;
String branch;
static Student s=new Student();
private Student()
{
	id=2100030494;
	name="sk.khadeer basha";
	branch="CSE";
}
public static Student getInstance()
{
	return s;
}
}
