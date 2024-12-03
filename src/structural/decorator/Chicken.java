package structural.decorator;

public class Chicken extends PizzaDecorator {

	private final Pizza pizza;
	
	public Chicken(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public String getDesc() {
		return pizza.getDesc() + " ,Added Chicken!!!!";
	}
	@Override
	public double getPrice() {
		return pizza.getPrice() + 20;
	}

}
