package power;
import java.util.*;
public class Power {
private int base;
private int expo;
public int getsum()
{
	int p;
	int i;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter base");
	base=scan.nextInt();
	System.out.println("enter the exponent");
	expo=scan.nextInt();
	scan.close();
	p=base;
	i=2;
	while(i<=expo)
	{
	p=p*base;
	i++;
	}
	return p;
	
}
	public static void main(String[] args) {
		Power p=new Power();
		System.out.println("power is="+p.getsum());
	}

}
