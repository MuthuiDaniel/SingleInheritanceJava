// Vehicle class (Base class)
public class Vehicle {
    // Common attributes for all vehicles
    protected String brand;
    protected String model;

    // Constructor for Vehicle class
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Common behavior for all vehicles
    public void startEngine() {
        System.out.println("Starting the engine of the " + brand + " " + model);
    }

    // Common behavior for all vehicles
    public void stopEngine() {
        System.out.println("Stopping the engine of the " + brand + " " + model);
    }
}
