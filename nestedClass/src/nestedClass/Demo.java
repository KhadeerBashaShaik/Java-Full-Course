package nestedClass;

public class Demo {

	public static void main(String[] args) {
		OuterDemo od=new OuterDemo();
		od.outer_dis();
		OuterDemo.InnerDemo i=od.new InnerDemo();
		i.inner_dis();

	}

}
