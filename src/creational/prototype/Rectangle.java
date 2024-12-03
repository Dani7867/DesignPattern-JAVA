package creational.prototype;

public class Rectangle implements Shape {
	private int x, y, width, height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

	
	public Shape clone() {
		try {
			return (Shape) super.clone();
		}
		catch(CloneNotSupportedException e){
			e.printStackTrace();
			return null;
			
		}
	}
	public void draw() {
        System.out.println("Drawing Rectangle at (" + x + ", " + y + ") with dimensions " + width + "x" + height);
    }

    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void setSize(int size) {
        this.width = size;
        this.height = size;
    }
}

