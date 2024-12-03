package creational.abstractfactory;

public class WinCheckbox implements Checkbox {
	@Override
	public void paint() {
		System.out.println("Rendering a checkbox in Windows style.\"");
	}

}
