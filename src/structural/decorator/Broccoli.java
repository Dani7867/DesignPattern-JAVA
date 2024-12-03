package structural.decorator;

public class Broccoli extends PizzaDecorator{

	private final Pizza pizza;
	
	 public Broccoli(Pizza pizza){
         this.pizza = pizza;
	 }
	 
	public String getDesc() {
		return pizza.getDesc() + " ,Added Broccoli";
		 }
	
	@Override
	public double getPrice() {
		return pizza.getPrice() + 10;
	}

}
