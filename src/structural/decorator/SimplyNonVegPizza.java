package structural.decorator;

public class SimplyNonVegPizza implements Pizza {

	@Override
	public String getDesc() {
		return "nonveggie";
	}

	@Override
	public double getPrice() {
		return 400;
	}

}
