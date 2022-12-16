package iinsem1;
 
public class Dictionary {
private String name;
private long mob;
public Dictionary(String name, long mob) {
	this.name = name;
	this.mob = mob;
}
@Override
public String toString() {
	return "Dictionary [name=" + name + ", mob=" + mob + "]";
}
}
