package carshowrooom;

public class Engine {
int engineId;
String engineType;
int horsepower;
float engineWeight;
public Engine(int eid,String etyp,int hpw,float ew)
{
	this.engineId=eid;
	this.engineType=etyp;
	this.engineWeight=ew;
	this.horsepower=hpw;
}
public int  getEngineId() {
	return engineId;
}
public String getEngineType()
{
	return engineType;
}
public int getHorsePower()
{
	return horsepower;
}
public float getEngineWeight()
{
	return engineWeight;
}
public String toString()
{
	return ("engine id="+this.getEngineId()+"\nengine type="+this.getEngineType()+"\nengine horsepower="+this.getHorsePower()+"\nengine weight="+this.getEngineWeight());
}

}