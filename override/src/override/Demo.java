package override;
public class Demo {

	public static void main(String[] args) {
		Cuboid c = new Cuboid(23, 24, 34);
		c.display();
		double y = c.area();
		System.out.println("area of cuboid" + y);
	}

}
