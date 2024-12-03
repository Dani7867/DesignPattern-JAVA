package creational.factory2;

public class TestFactory2 {

	public static void main(String[] args) {
		DisplayService service = new ErrorXMLDisplayService();
		service.display();
	
		service = new FeedbackXMLDisplayService();
		service.display();
	}

}
