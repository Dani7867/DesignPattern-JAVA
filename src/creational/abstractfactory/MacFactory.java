package creational.abstractfactory;

public class MacFactory implements abstractGUIFactory {
	
	public Button createButton() {
		return new MacButton();
	}
	
	public Checkbox createCheckbox() {
		return new MacCheckbox();
	}

}
