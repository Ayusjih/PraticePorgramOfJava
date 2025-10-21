package OOP;

public class Car extends Vehicle {
    // --- FIELDS ---
    private int numberOfDoors;

    private static final double FUEL_CONSUMPTION_RATE = 0.08; // 8L/100km


    public Car(String make, String model, int year, double fuelLevel, double fuelCapacity, int numberOfDoors) {

        super(make, model, year, fuelLevel, fuelCapacity);
        this.numberOfDoors = numberOfDoors;
    }


    @Override
    public void startEngine() {
        System.out.println("Starting the car's engine... Vroom! 🚗");
        if (getFuelLevel() <= 0) {
            System.out.println("Warning: Out of fuel! Please refuel.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " (" + this.numberOfDoors + " doors)";
    }


    public void drive(double distance) {
        System.out.printf("Preparing to drive the %s for %.1f km.%n", getModel(), distance);

        super.drive(distance, FUEL_CONSUMPTION_RATE);
    }
}
