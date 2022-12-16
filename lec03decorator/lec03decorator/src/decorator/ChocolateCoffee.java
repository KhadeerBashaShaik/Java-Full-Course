package decorator;

public class ChocolateCoffee extends AbstractCoffee{

	public ChocolateCoffee(ICoffee sc) {
		super(sc);
	}
	
	public double getPrice() {
		return this.specialCoffee.getPrice()+this.getChocCoffeePrice();
	}
	
	private double getChocCoffeePrice() {
		return 30*(1.15);
	}
}
