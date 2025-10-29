package OOP;
public class Motorcycle extends Vehicle {

    private boolean hasSidecar;

    private static final double FUEL_CONSUMPTION_RATE = 0.03; // 3L/100km


    public Motorcycle(String make, String model, int year, double fuelLevel, double fuelCapacity, boolean hasSidecar) {

        super(make, model, year, fuelLevel, fuelCapacity);
        this.hasSidecar = hasSidecar;
    }


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


    public void drive(double distance) {
        System.out.printf("Preparing to ride the %s for %.1f km.%n", getModel(), distance);


        double currentConsumptionRate = hasSidecar ? FUEL_CONSUMPTION_RATE * 1.15 : FUEL_CONSUMPTION_RATE;

        super.drive(distance, currentConsumptionRate);
    }
}
