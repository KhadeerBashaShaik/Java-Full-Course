package preparation;
import java.util.*;
public class Library {
static int bcount=0;
ArrayList <Book> bl=new ArrayList<Book>();
public void addBook(long bid,String bname,String bauthor,int yop) {
	bl.add(new Book(bid,bname,bauthor,yop));
	bcount++;
}
public void print() {
	for(Book b:bl)
		System.out.println(b);
	System.out.println("no.of books="+bcount);
	
}
public boolean search(long bid) {
	int f=0,i;
	for(i=0;i<bl.size();i++)
	{
		if(bl.get(i).bid==bid)
		{
			f=1;
			break;
		}
	}
	if(f==1)
	{
		System.out.println(bl.get(i));
		return true;
	}
	else
		return false;
}
}
