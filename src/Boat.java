// Boat class (Subclass of Vehicle)
public class Boat extends Vehicle {
    // Unique attributes for boats
    private String propulsionType;
    private boolean hasSail;

    // Constructor for Boat class
    public Boat(String brand, String model, String propulsionType, boolean hasSail) {
        super(brand, model);
        this.propulsionType = propulsionType;
        this.hasSail = hasSail;
    }

    // Unique behavior for boats
    public void startSailing() {
        System.out.println("Starting to sail the " + brand + " " + model);
    }

    // Unique behavior for boats
    public void dropAnchor() {
        System.out.println("Dropping anchor for the " + brand + " " + model);
    }
}
