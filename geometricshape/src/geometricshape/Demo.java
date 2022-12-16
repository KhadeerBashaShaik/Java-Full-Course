package geometricshape;

public class Demo {

	public static void main(String[] args) {
Rectangle r=new Rectangle();
r.setBorderColour("green");
r.setFilled(true);
r.setLength(9.5);
r.setWidth(9.8);
System.out.println(r);
Circle c=new Circle();
c.setRadius(5.8);
c.setBorderColour("blue");
c.setFilled(true);
System.out.println(c);
	}

}