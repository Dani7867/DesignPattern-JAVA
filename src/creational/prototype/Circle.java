package creational.prototype;

public class Circle implements Shape{
	private int x,y,radius;
	
	public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
	@Override
	public Shape clone() {
	    try {
	        return (Shape) super.clone();
	    } catch (CloneNotSupportedException e) {
	        e.printStackTrace(); // Log the error for debugging
	        return null; // Return null to indicate cloning failed
	    }
	}

	@Override
    public void draw() {
        System.out.println("Drawing Circle at (" + x + ", " + y + ") with radius " + radius);
    }

    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void setSize(int size) {
        this.radius = size;
    }

}
