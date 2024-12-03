package structural.facade;

public class StreamingService {
    public void prepareStream(String movieName) {
        System.out.println("Preparing stream for movie: " + movieName);
    }

    public void startStream() {
        System.out.println("Starting movie stream...");
    }
}

