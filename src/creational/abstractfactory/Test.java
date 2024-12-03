package creational.abstractfactory;

public class Test {

	 static Application configureApplication(String osName) {
	        Application app;
	        abstractGUIFactory factory;
	        
	        // Configuring the app based on the operating system.
	        if (osName.contains("WIN")) {
	            factory = new WinFactory();
	        } else {
	            factory = new MacFactory();
	        }
	        
	        app = new Application(factory);
	        return app;
	    }

	    public static void main(String[] args) {
	        Application app = configureApplication("MAC");
	        app.paint();
	    }

}
