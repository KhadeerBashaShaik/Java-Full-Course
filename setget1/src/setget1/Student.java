package setget1;

public class Student {
private long sid;
private String name;
private int rank;
private int age;
public long getSid() {
	return sid;
}
public void setSid(long sid) {
	this.sid = sid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRank() {
	return rank;
}
public void setRank(int rank) {
	this.rank = rank;
}
public int getAge() {
	return age;
}
public boolean setAge(int age) {
	if(age<17||age>21)
	{
		this.age=0;
		return false;
	}
	else
	{
		this.age = age;
		return true;
	}
}
public String toString()
{
	return ("student object is created with student id"+this.getSid()+"\nname="+this.getName()+"\nrank="+this.getRank()+"\nage="+this.getAge());
}

}
