package creational.singleton;

public class Main {
    public static void main(String[] args) {
        // Get the single instance of ChocolateBoiler
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        
        // Fill, boil, and drain the boiler
        boiler.fill();
        boiler.boil();
        boiler.drain();

        // Get the same instance again and try to operate
        ChocolateBoiler anotherBoiler = ChocolateBoiler.getInstance();
        anotherBoiler.fill(); // Won't fill since it's already filled
        anotherBoiler.boil(); // Won't boil again since it's already boiled
        anotherBoiler.drain(); // Will drain
    }
}

