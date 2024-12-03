package structural.facade;

public class TestF {
	public static void main(String[] args) {
		
		StreamingFacade control = new StreamingFacade();
		
		String user = "john_doe";
        String movieName = "The Matrix";
        
        control.streamMovie(user,movieName);
	}
}
