package structural.decorator;

public class Test {

	public static void main(String[] args) {
		Pizza pizza = new SimplyVegPizza();
		pizza = new Broccoli(pizza);
		System.out.println(pizza.getDesc());
		System.out.println(pizza.getPrice());
		
		pizza = new SimplyNonVegPizza();
		pizza = new Chicken(pizza);
		System.out.println("\n"+pizza.getDesc());
		System.out.println(pizza.getPrice());

	}

}
