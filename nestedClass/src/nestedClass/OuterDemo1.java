package nestedClass;

public class OuterDemo1 {
	int outer_x;
	OuterDemo1()
	{
		outer_x=30;
	}
	public class InnerDemo{
		int inner_x;
		InnerDemo()
		{
			inner_x=50;
		}
		public void inner_dis()
		{
			System.out.println("Inner_x="+inner_x);
		}
	}
	public void outer_dis()
	{
		System.out.println(outer_x);
		InnerDemo i=new InnerDemo();
		i.inner_dis();
	}
}
