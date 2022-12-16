package aggregation;
public class Emp {
int id;
String name;
Address address;
public Emp(int id,String name,Address address)
{
	this.id=id;
	this.name=name;
	this.address=address;
}
void display() {
	System.out.println(id+" "+name+" "+address);
}
	public static void main(String[] args) {
		Address address1=new Address("gzb","up","india");
		Address address2=new Address("gno","up","india");
		
		Emp e=new Emp(111,"khadeer",address1);
		Emp e2=new Emp(112,"jp",address2);
		
		e.display();
		e2.display();
	}
}
