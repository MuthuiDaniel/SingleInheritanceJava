//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Main class for testing
public class Main {
    public static void main(String[] args) {
        // Testing Motorcycle
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR1000RR", 2, true);
        motorcycle.startEngine();
        motorcycle.wheelie();
        motorcycle.honkHorn();
        motorcycle.stopEngine();

        // Testing Bus
        Bus bus = new Bus("Mercedes", "Sprinter", 12, false);
        bus.startEngine();
        bus.openDoor();
        bus.announceNextStop();
        bus.stopEngine();

        // Testing Trailer
        Trailer trailer = new Trailer("Utility", "Flatbed", 5000, true);
        trailer.startEngine();  // Note: Trailers typically don't have engines; this is for demonstration purposes.
        trailer.loadCargo();
        trailer.unloadCargo();
        trailer.stopEngine();

        // Testing Boat
        Boat boat = new Boat("Yamaha", "242X", "Jet Drive", false);
        boat.startEngine();
        boat.startSailing();
        boat.dropAnchor();
        boat.stopEngine();
    }
}
