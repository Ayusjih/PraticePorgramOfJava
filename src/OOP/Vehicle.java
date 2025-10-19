package OOP;

import OOP.Drivable;

public abstract class Vehicle implements Drivable {

    // --- FIELDS ---
    // Encapsulation is strengthened by making all fields private.
    private String make;
    private String model;
    private int year;
    private double fuelLevel;
    private final double fuelCapacity; // Added a constant for max fuel

    // --- CONSTRUCTOR ---
    public Vehicle(String make, String model, int year, double fuelLevel, double fuelCapacity) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelCapacity = fuelCapacity;
        // Ensure initial fuel level doesn't exceed capacity
        this.fuelLevel = Math.min(fuelLevel, fuelCapacity);
    }

    // --- ABSTRACT METHODS (from Drivable interface) ---
    // Subclasses MUST provide their own implementation for these.
    @Override
    public abstract void startEngine();

    // --- CONCRETE METHODS (Behavior) ---
    @Override
    public void stopEngine() {
        System.out.println(getMake() + " " + getModel() + "'s engine has stopped.");
    }

    /**
     * Simulates driving the vehicle, which consumes fuel.
     * @param distance The distance to drive in kilometers.
     * @param fuelConsumptionRate Liters per kilometer.
     */
    public void drive(double distance, double fuelConsumptionRate) {
        double fuelNeeded = distance * fuelConsumptionRate;
        if (fuelLevel >= fuelNeeded) {
            this.fuelLevel -= fuelNeeded;
            System.out.printf("%s drove %.1f km. Fuel left: %.2f L%n", this, distance, getFuelLevel());
        } else {
            System.out.println("Not enough fuel to drive that far! Please refuel.");
        }
    }

    /**
     * Adds fuel to the vehicle's tank.
     * Includes validation to prevent adding a negative amount or overfilling.
     * @param amount The amount of fuel to add.
     */
    public void refuel(double amount) {
        if (amount <= 0) {
            System.out.println("Cannot refuel a negative or zero amount.");
            return;
        }

        if (this.fuelLevel + amount > this.fuelCapacity) {
            System.out.printf("Cannot overfill the tank. Topping up to max capacity (%.1f L).%n", this.fuelCapacity);
            this.fuelLevel = this.fuelCapacity;
        } else {
            this.fuelLevel += amount;
            System.out.printf("Refueled %.2f L. Current fuel level: %.2f L%n", amount, getFuelLevel());
        }
    }

    // --- GETTERS (Access to encapsulated data) ---
    @Override
    public double getFuelLevel() {
        return this.fuelLevel;
    }