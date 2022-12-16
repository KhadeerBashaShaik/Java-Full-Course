package mid1;

import java.util.Scanner;

public class Book {
 private long isbn;
private String title;
private double price;
	public long getIsbn() {
	return isbn;
}
public void setIsbn(long isbn) {
	this.isbn = isbn;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String toString() {
	return ("ISBN number="+this.getIsbn()+"\nTitle"+this.getTitle()+"\nprice="+this.getPrice());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b=new Book();
		long isbn;
		String title;
		double price;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter isbn");
		isbn=sc.nextLong();
		b.setIsbn(isbn);
		System.out.println("enter title"); 
		title=sc.next();
		b.setTitle(title);
		System.out.println("enter price");
		price=sc.nextDouble();
		b.setPrice(price);
		sc.close();
		System.out.println(b);
		
	}

}
