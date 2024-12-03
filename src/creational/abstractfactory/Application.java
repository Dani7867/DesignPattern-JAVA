package creational.abstractfactory;

public class Application {
	Button button;
    Checkbox checkbox;
    
    public Application(abstractGUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }
    
    public void paint() {
        button.paint();
        checkbox.paint();
    }
}

