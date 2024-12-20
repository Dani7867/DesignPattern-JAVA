package creational.builder;

public class SportsCarBuilder implements CarBuilder {

	private final Car car = new Car("SPORTS");
	@Override
	public void buildBodyStyle() {
		car.setBodyStyle(" External dimensions: overall length (inches): 192.3," +" overall width (inches): 75.5, "
				+ "overall height (inches): 54.2, wheelbase (inches): 112.3," +
				" front track (inches): 63.7, rear track (inches): 64.1 and curb to curb turning circle (feet): 37.7");
	}

	@Override
	public void buildPower() {
		car.setPower("323 hp @ 6,800 rpm; 278 ft lb of torque @ 4,800 rpm");

	}

	@Override
	public void buildEngine() {
		car.setEngine("3.6L V 6 DOHC and variable valve timing");

	}

	@Override
	public void buildBreaks() {
		car.setBreaks("Four-wheel disc brakes: two ventilated. Electronic brake  distribution. StabiliTrak stability control");


	}

	@Override
	public Car getCar() {
		return car;
	}

}
