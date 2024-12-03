package creational.builder;

public class Test {

	public static void main(String[] args) {
		CarBuilder carbuilder = new SedanCarBuilder();
		CarDirector director = new CarDirector(carbuilder);
		director.build();
		Car car = carbuilder.getCar();
		System.out.println(car);
		
		carbuilder = new SportsCarBuilder();
		director = new CarDirector(carbuilder);
		director.build();
		car = carbuilder.getCar();
		System.out.println(car);

	}

}
