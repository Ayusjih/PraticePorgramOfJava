package OOP;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, int year, double fuelLevel, int numberOfDoors) {
        // 'super()' calls the constructor of the parent class (Vehicle)
        super(make, model, year, fuelLevel);
        this.numberOfDoors = numberOfDoors;
    }

    // Polymorphic implementation of the abstract method
    @Override
    public void startEngine() {
        System.out.println("Starting the car's engine... Vroom! 🚗");
        if (fuelLevel <= 0) {
            System.out.println("Warning: Out of fuel!");
        }
    }

    // Overriding toString() for a custom description
    @Override
    public String toString() {
        return super.toString() + " (" + this.numberOfDoors + " doors)";
    }
}