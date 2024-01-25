// Trailer class (Subclass of Vehicle)
public class Trailer extends Vehicle {
    // Unique attributes for trailers
    private int loadCapacity;
    private boolean hasRamp;

    // Constructor for Trailer class
    public Trailer(String brand, String model, int loadCapacity, boolean hasRamp) {
        super(brand, model);
        this.loadCapacity = loadCapacity;
        this.hasRamp = hasRamp;
    }

    // Unique behavior for trailers
    public void loadCargo() {
        System.out.println("Loading cargo onto the " + brand + " " + model);
    }

    // Unique behavior for trailers
    public void unloadCargo() {
        System.out.println("Unloading cargo from the " + brand + " " + model);
    }
}

