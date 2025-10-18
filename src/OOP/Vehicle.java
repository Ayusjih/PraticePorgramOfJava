package OOP;

public abstract class Vehicle implements Drivable {
    // Encapsulated fields
    private String make;
    private String model;
    private int year;
    protected double fuelLevel; // protected so subclasses can access it

    public Vehicle(String make, String model, int year, double fuelLevel) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelLevel = fuelLevel;
    }

    // Concrete implementation of a method from the interface
    @Override
    public void stopEngine() {
        System.out.println(getMake() + " " + getModel() + "'s engine has stopped.");
    }

    // --- Getters for encapsulated data ---
    @Override
    public double getFuelLevel() {
        return this.fuelLevel;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return year + " " + make + " " + model;
    }
}