package iinsem1;

public class Car {
long id;
String name;
String type;
Car(long id,String name,String type){
	this.id=id;
	this.name=name;
	this.type=type;
}
@Override
public String toString() {
	return "Car [id=" + id + ", name=" + name + ", type=" + type + "]";
}

}
