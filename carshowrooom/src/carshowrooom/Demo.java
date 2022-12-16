package carshowrooom;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
	String regno,carMake,carModel;
	int yop;
	String colour;
	int eid;
	String etyp;
	int hpw;
	float ew;
	ShowRoom sr=new ShowRoom();
	int option;
	String choice;
	do {
		System.out.println("enter \n1. Add new car\n2.display all cars\n");
		option=scan.nextInt();
		switch(option)
		{
		case 1:
			System.out.println("enter regiistration number");
			regno=scan.next();
			System.out.println("enter car make");
			carMake=scan.next();
			System.out.println("enter car model");
			carModel=scan.next();
			System.out.println("enter year of purchase");
			yop=scan.nextInt();
			System.out.println("enter the colour");
			colour=scan.next();
			System.out.println("enter engine id");
			eid=scan.nextInt();
			System.out.println("enter engine type");
			etyp=scan.next();
			System.out.println("enter horse power");
			hpw=scan.nextInt();
			System.out.println("enter engine weight");
			ew=scan.nextFloat();
			sr.addcar(regno, carMake, carModel, yop, colour, eid, etyp, hpw, ew);
			break;
		case 2:
			sr.displaycars();
		}
			System.out.println("do you want to continue(yes/no)");
		choice=scan.next();
	}
	while(choice!="no");
}
	}

}
