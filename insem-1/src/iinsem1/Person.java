package iinsem1;

import java.util.ArrayList;

public class Person {

ArrayList <Dictionary> d=new ArrayList<Dictionary>();
static int count =0;
public void newperson(String name,long mob) {
	d.add(new Dictionary(name, mob));
	count++;
}
public void display() {
for(Dictionary dl:d)
	System.out.println(dl);
}
}
