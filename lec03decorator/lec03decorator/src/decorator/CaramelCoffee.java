package decorator;

public class CaramelCoffee extends AbstractCoffee{

	public CaramelCoffee(ICoffee sc) {
		super(sc);
	}
	
	public double getPrice() {
		return this.specialCoffee.getPrice()+getCaramelCoffeePrice();
	}
	
	private double getCaramelCoffeePrice() {
		return 20*(1.18);
	}
}
