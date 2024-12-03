package creational.factory2;

public class ErrorXMLDisplayService extends DisplayService{

	@Override
	protected XMLParser getParser() {
		return new ErrorXMLParser();
	}

}