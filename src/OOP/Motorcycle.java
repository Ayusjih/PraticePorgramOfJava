package OOP;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String make, String model, int year, double fuelLevel, boolean hasSidecar) {
        super(make, model, year, fuelLevel);
        this.hasSidecar = hasSidecar;
    }

    // A different polymorphic implementation of startEngine()
    @Override
    public void startEngine() {
        System.out.println("Starting the motorcycle's engine... Rrrrumble! 🏍️");
        if (fuelLevel <= 0) {
            System.out.println("Warning: Out of fuel!");
        }
    }

    @Override
    public String toString() {
        return super.toString() + (this.hasSidecar ? " with a sidecar" : " without a sidecar");
    }
}