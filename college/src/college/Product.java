package college;
import java.util.*;
public class Product {
private long pid;
private String pname;
private int qty;
private double price;
Product(long pid,String pname)
{
	this.pid=pid;
	this.pname=pname;
}

	public int getQty() {
	return qty;
}

public boolean setQty(int qty) {
	if(qty<0)
	{
		this.qty=0;
		return false;
	}
	else
	{
		this.qty=qty;
		return true;
	}
}

public double getPrice() {
	return price;
}

public boolean setPrice(double price) {
	if(price<0)
	{
		this.price=0;
		return false;
	}
	else
	{
		this.price=price;
		return true;
	}
}
public String toString()
{
	double amt=this.getQty()*this.getPrice();
	return ("Product id:"+this.pid+"\n Product name:"+this.pname+"\n Product Quantity:"+this.getQty()+"\n product price:"+this.getPrice()+"\n Amount to be paid:"+amt);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		long pid;
		String name;
		int qty;
		double price;
		System.out.println("enter priduct id");
		pid=scan.nextLong();
		System.out.println("enter product name");
		name=scan.next();
		System.out.println("enter product quantity");
		qty=scan.nextInt();
		System.out.println("enter product price");
		price=scan.nextDouble();
		scan.close();
		Product p=new Product(pid,name);
		if(p.setPrice(price)==true&&p.setQty(qty))
			System.out.println(p);
		else
			System.out.println("invalid input");
	}
}
