package creational.builder;

public interface CarBuilder {
	
	public void buildBodyStyle();
	public void buildPower();
	public void buildEngine();
	public void buildBreaks();
	public Car getCar();
}
