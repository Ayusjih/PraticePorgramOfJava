package OOP;
public class Motorcycle extends Vehicle {
    // --- FIELDS ---
    private boolean hasSidecar;
    // Motorcycles are generally more fuel-efficient than cars
    private static final double FUEL_CONSUMPTION_RATE = 0.03; // 3L/100km

    // --- CONSTRUCTOR ---
    /**
     * Updated constructor to match the parent Vehicle's new constructor.
     * It now requires a fuelCapacity.
     */
    public Motorcycle(String make, String model, int year, double fuelLevel, double fuelCapacity, boolean hasSidecar) {
        // Call the parent constructor
        super(make, model, year, fuelLevel, fuelCapacity);
        this.hasSidecar = hasSidecar;
    }

    // --- OVERRIDDEN METHODS ---
    @Override
    public void startEngine() {
        System.out.println("Starting the motorcycle's engine... Rrrrumble! 🏍️");
        if (getFuelLevel() <= 0) {
            System.out.println("Warning: Out of fuel! Please refuel.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + (this.hasSidecar ? " with a sidecar" : " without a sidecar");
    }

    // --- NEW MOTORCYCLE-SPECIFIC METHODS ---
    /**
     * A specialized drive method for the Motorcycle.
     * It calls the parent's drive method but provides its own consumption rate.
     * We'll pretend a sidecar makes it slightly less efficient.
     * @param distance The distance to drive.
     */
    public void drive(double distance) {
        System.out.printf("Preparing to ride the %s for %.1f km.%n", getModel(), distance);

        // A sidecar adds drag, increasing fuel consumption slightly
        double currentConsumptionRate = hasSidecar ? FUEL_CONSUMPTION_RATE * 1.15 : FUEL_CONSUMPTION_RATE;

        super.drive(distance, currentConsumptionRate);
    }
}
