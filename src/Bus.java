// Bus class (Subclass of Vehicle)
public class Bus extends Vehicle {
    // Unique attributes for buses
    private int seatingCapacity;
    private boolean doubleDecker;

    // Constructor for Bus class
    public Bus(String brand, String model, int seatingCapacity, boolean doubleDecker) {
        super(brand, model);
        this.seatingCapacity = seatingCapacity;
        this.doubleDecker = doubleDecker;
    }

    // Unique behavior for buses
    public void openDoor() {
        System.out.println("Opening the door of the " + brand + " " + model);
    }

    // Unique behavior for buses
    public void announceNextStop() {
        System.out.println("Announcing the next stop on the " + brand + " " + model);
    }
}

