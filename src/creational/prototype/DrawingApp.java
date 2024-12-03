package creational.prototype;

public class DrawingApp {

	public static void main(String[] args) {
		 ShapeRegistry shapeRegistry = new ShapeRegistry();
		 
		 	shapeRegistry.addShape("Circle", new Circle(0, 0, 10));
	        shapeRegistry.addShape("Rectangle", new Rectangle(0, 0, 20, 30));
	        shapeRegistry.addShape("Triangle", new Triangle(0, 0, 15, 25));
	        
	        Shape clonedCircle = shapeRegistry.getShape("Circle");
	        clonedCircle.setPosition(5, 5);
	        clonedCircle.setSize(15);

	        Shape clonedRectangle = shapeRegistry.getShape("Rectangle");
	        clonedRectangle.setPosition(10, 10);
	        clonedRectangle.setSize(40);

	        Shape clonedTriangle = shapeRegistry.getShape("Triangle");
	        clonedTriangle.setPosition(20, 20);
	        clonedTriangle.setSize(30);
	        
	        clonedCircle.draw();
	        clonedRectangle.draw();
	        clonedTriangle.draw();

	}

}
