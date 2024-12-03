package behavioral.strategy;

public class TextEditor {
	
	private TextFormatter textFormatter;
	
	public TextEditor(TextFormatter textformatter) {
		this.textFormatter = textformatter;
	}
	
	public void publishText(String text){
        textFormatter.format(text);
	}

}
