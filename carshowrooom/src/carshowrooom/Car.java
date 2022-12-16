package carshowrooom;
public class Car {
String regno;
String carMake;
String carModel;
int yop;
String colour;
Engine carEngine;
Car(String regno,String carMake,String carModel,int yop,String colour,Engine carEngine){
	this.regno=regno;
	this.carModel=carModel;
	this.yop=yop;
	this.colour=colour;
	this.carMake=carMake;
	this.carEngine=carEngine;
}
public String toString() {
	return ("Reg no="+this.regno+"\nCar make="+this.carMake+"\nCar Model="+this.carModel+"\ncar colour="+this.colour+"\nyear of purchase"+this.yop+"\nengine information="+this.carEngine);
}
}