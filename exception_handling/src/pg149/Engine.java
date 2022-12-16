package pg149;

import java.util.Scanner;

public class Engine {
long id;
String type;
int hp;
int w;

public Engine(long id, String type, int hp, int w) {
	this.id = id;
	this.type = type;
	this.hp = hp;
	this.w = w;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getHp() {
	return hp;
}
public void setHp(int hp) {
	this.hp = hp;
}
public int getW() {
	return w;
}
public void setW(int w) {
	this.w = w;
}
@Override
public String toString() {
	return "Engine [id=" + id + ", type=" + type + ", hp=" + hp + ", w=" + w + "]";
}
public static void main(String args[]) {
	long id;
	String type;
	int hp;
	int ew;
	int a=0;
	long x;
	try (Scanner scan = new Scanner(System.in)) {
		System.out.println("enter engine id");
		id=scan.nextLong();
		x=id;
		while(id>0) {
			a++;
			id=id/10;
		}
		try {
			if(a>5)
			throw new EngineID("incorrect id number entered");
		}
		catch(EngineID id1)
		{
			System.out.println(id1);
		}
		System.out.println("enter engine type");
		type=scan.next();
		try {
			if(type.length()!=8)
			throw new EngineType("incorrect engine type entered");
		}
		catch(EngineType et)
		{
			System.out.println(et);
		}
		System.out.println("enter the horse power");
		hp=scan.nextInt();
		try {
			if(hp>2000)
			throw new HorsePower("incorrect horse power entered");
		}
		catch(HorsePower h)
		{
			System.out.println(h);
		}
		System.out.println("enter engine weight");
		ew=scan.nextInt();
	}
	try {
		if(ew>500)
		throw new EngineWeight("incorrect engine weight entered");
	}
	catch(EngineWeight e)
	{
		System.out.println(e);
	}
	Engine e2=new Engine(x,type,hp,ew);
	System.out.println(e2);
}
}