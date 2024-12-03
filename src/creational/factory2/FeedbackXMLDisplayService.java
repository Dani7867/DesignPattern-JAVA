package creational.factory2;

public class FeedbackXMLDisplayService extends DisplayService{
	
	@Override
	protected XMLParser getParser() {
		return new FeedbackXML();
	}
}
