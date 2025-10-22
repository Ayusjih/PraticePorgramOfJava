package OOP;

import OOP.Drivable;

public abstract class Vehicle implements Drivable {

    private String make;
    private String model;
    private int year;
    private double fuelLevel;
    private final double fuelCapacity;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    // --- CONSTRUCTOR ---
    public Vehicle(String make, String model, int year, double fuelLevel, double fuelCapacity) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelCapacity = fuelCapacity;
        // Ensure initial fuel level doesn't exceed capacity
        this.fuelLevel = Math.min(fuelLevel, fuelCapacity);
    }


    @Override
    public abstract void startEngine();

    // --- CONCRETE METHODS (Behavior) ---
    @Override
    public void stopEngine() {
        System.out.println(getMake() + " " + getModel() + "'s engine has stopped.");
    }


    public void drive(double distance, double fuelConsumptionRate) {
        double fuelNeeded = distance * fuelConsumptionRate;
        if (fuelLevel >= fuelNeeded) {
            this.fuelLevel -= fuelNeeded;
            System.out.printf("%s drove %.1f km. Fuel left: %.2f L%n", this, distance, getFuelLevel());
        } else {
            System.out.println("Not enough fuel to drive that far! Please refuel.");
        }
    }


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


    @Override
    public double getFuelLevel() {
        return this.fuelLevel;
    }}