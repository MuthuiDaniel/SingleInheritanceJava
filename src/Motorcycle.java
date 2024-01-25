// Motorcycle class (Subclass of Vehicle)
public class Motorcycle extends Vehicle {
    // Unique attributes for motorcycles
    private int numWheels;
    private boolean hasFairing;

    // Constructor for Motorcycle class
    public Motorcycle(String brand, String model, int numWheels, boolean hasFairing) {
        super(brand, model);
        this.numWheels = numWheels;
        this.hasFairing = hasFairing;
    }

    // Unique behavior for motorcycles
    public void wheelie() {
        System.out.println("Performing a wheelie on the " + brand + " " + model);
    }

    // Unique behavior for motorcycles
    public void honkHorn() {
        System.out.println("Honking the horn of the " + brand + " " + model);
    }
}
