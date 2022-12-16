package entity;
public class Point {
  private double x; //Members
  private double y; //Members
  
  private Point()
  {
    x=20;
    y=20;
  }
  Point(double x,double y)
  {
    this();
    this.setX(x);
    this.setY(y);
  }
  
  private boolean setX(double x)
  {
    if(x>=-100 && x<=100)
    {
      this.x=x;
      return true;
    }
    
    return false;
  }
  
  private boolean setY(double y)
  {
    if(y>=-200 && y<=200)
    {
      this.y=y;
      return true;
    }
    return false;
  }
  
  private double getX(double x)
  {
    return x;
  }
  
  private double getY(double y)
  {
    return y;
  }
  
  private double calcDistance()
  {
    return (Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)));
    
  }
  
  private double calcDistance(Point point)
  {
    return (Math.sqrt(Math.pow(point.x-this.x, 2)+Math.pow(point.y-this.y, 2)));
  }
  
  public String toString()
  {
    return String.format(null, null, null);
  }
}