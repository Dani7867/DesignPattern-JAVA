package structural.facade;

public class StreamingFacade {
	   	
		private UserAccount userAccount;
	    private MovieSelection movieSelection;
	    private StreamingService streamingService;
	    private PaymentProcessor paymentProcessor;
	    
	    public StreamingFacade() {
	    	userAccount = new UserAccount();
	        movieSelection = new MovieSelection();
	        streamingService = new StreamingService();
	        paymentProcessor = new PaymentProcessor();
	    }
	    
	    public void streamMovie(String user, String movieName) {
	    	 if (userAccount.checkSubscription(user)) {
	             // Select the movie
	             String selectedMovie = movieSelection.selectMovie(movieName);
	             
	             // Process payment (if necessary)
	             paymentProcessor.processPayment();
	             
	             // Prepare and start streaming
	             streamingService.prepareStream(selectedMovie);
	             streamingService.startStream();
	         } else {
	             System.out.println("User is not subscribed. Cannot stream the movie.");
	         }
	    }
}
