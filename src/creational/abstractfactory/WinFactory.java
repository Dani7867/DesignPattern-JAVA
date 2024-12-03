package creational.abstractfactory;

public class WinFactory implements abstractGUIFactory {

	@Override
	public Button createButton() {
		return new WinButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WinCheckbox();
	}

}
