package creational.singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    // The single instance of ChocolateBoiler (lazy initialization)
    private static ChocolateBoiler uniqueInstance;

    // Private constructor to prevent instantiation
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    // Public method to get the single instance
    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }

    // Fill the boiler with a chocolate mixture
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // Fill the boiler with milk and chocolate
            System.out.println("Filling the boiler with chocolate mixture.");
        }
    }

    // Drain the boiled chocolate mixture
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
            // Drain the boiled mixture
            System.out.println("Draining the boiled chocolate mixture.");
        }
    }

    // Boil the chocolate mixture
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
            // Bring the contents to a boil
            System.out.println("Boiling the chocolate mixture.");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
