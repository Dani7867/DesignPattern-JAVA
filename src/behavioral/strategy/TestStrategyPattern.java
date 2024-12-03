package behavioral.strategy;

public class TestStrategyPattern {
	
	public static void main(String[] args) {
	String text = "TextFormatter";
	TextFormatter textFormatter = new CapTextFormatter();
	TextEditor editor = new TextEditor(textFormatter);
	
	editor.publishText(text);

	textFormatter = new LowerTextFormatter();
	editor = new TextEditor(textFormatter);
	editor.publishText(text);
	
	}
}