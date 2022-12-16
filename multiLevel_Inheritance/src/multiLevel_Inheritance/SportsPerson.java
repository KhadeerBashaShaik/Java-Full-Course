package multiLevel_Inheritance;

public class SportsPerson extends Student {
String sport;
int rank;
SportsPerson(long uid, String name,int age,double h,long rno,String branch,String sport,int rank){
	super(uid,name,age,h,rno,branch);
	this.sport=sport;
	this.rank=rank;
}
@Override
public String toString() {
	return "SportsPerson [sport=" + sport + ", rank=" + rank + ", rno=" + super.rno + ", branch=" + super.branch + ", uid=" + super.uid
			+ ", name=" + super.name + ", age=" + super.age + ", height=" + super.height + "]";
}

}
