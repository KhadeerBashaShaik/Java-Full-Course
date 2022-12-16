package preparation;

public class Book {
 String bname;
long bid;
 String bauthor;
 int yop;
Book(long bid,String bname,String bauthor,int yop){
	this.setBid(bid);
	this.setBname(bname);
	this.setBauthor(bauthor);
	this.setYop(yop);
}
public boolean setBid(long bid) {
	if(bid>=10000&&bid<=99999) {
		this.bid=bid;
	return true;
	}
	else
		return false;
}
public boolean setBname(String bname) {
	int i=0,f=0;
	for(i=0;i<bname.length();i++) {
	if(bname.charAt(i)>='a'&&bname.charAt(i)>='z'||bname.charAt(i)>='A'&&bname.charAt(i)>='Z')
	{
		f=1;
		break;
	}
	}
	if(f==1)
	{
		this.bname=bname;
		return true;
	}
	else
		return false;
}
public void setBauthor(String bauthor) {
	this.bauthor=bauthor;
}
public void setYop(int yop) {
	this.yop=yop;
}
public String toString() {
	return ("book id="+this.bid+"\n book name"+this.bname+"\n book author"+this.bauthor+"\n year of publication"+this.yop);
}
}
