package decorator;
import java.util.Scanner;

public class CoffeeVendingMachine {

	private static Scanner ic = new Scanner(System.in);
	public static void main(String[] args) {
		int choice =0;
		boolean repeat = true;
		double totalCost = 0;
		ICoffee sc = new SimpleCoffee();
		while(repeat) {
			choice= menu();
			switch(choice) {
			case 1: sc = new CaramelCoffee(sc);break;
			case 2: sc = new ChocolateCoffee(sc);break;
			default: 
				repeat = false;
				System.out.println("Thanks for ordering coffee at 21VaritiesCluster1 Coffee Shop");
				System.out.printf("Total Amount = %.2f%n",sc.getPrice());
			}
		}
	}
	
	private static int menu() {
		System.out.println("1. Caramel Shot");
		System.out.println("2. Chocolate Shot");
		System.out.println("Any other number to complete the order");
		return ic.nextInt();
	}

}
