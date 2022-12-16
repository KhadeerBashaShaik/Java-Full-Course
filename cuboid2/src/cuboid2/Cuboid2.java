package cuboid2;

public class Cuboid2 {
	private double l;
	private double b;
	private double h;
	
	public boolean setL(double len)
	{
		if(len>0)
		{
			l=len;
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean setB(double bre)
	{
		if(bre>0)
		{
			b=bre;
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean setH(double hei)
	{
		if(hei>0)
		{
			h=hei;
			return true;
		}
		else
		{
			return false;
		}
	}
	public double getL()
	{
		return l;
	}
	public double getB()
	{
		return b;
	}
	public double getH()
	{
		return h;
	}
	public double volume()
	{
		return getL()*getB()*getH();
	}
	public String toString()
	{
		String str;
		str=String.format("Length :%f%nBreadth :%.5f%n"
				+"Height :%f%nVolume :%f",getL(),getB(),getH(),volume());
		return str;
	}
}
