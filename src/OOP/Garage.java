package OOP;

public class Garage {
    public static void main(String[] args) {
        // Create objects of the concrete classes
        Vehicle myCar = new Car("Honda", "Civic", 2024, 10.5, 4);
        Vehicle myMotorcycle = new Motorcycle("Royal Enfield", "Classic 350", 2022, 3.2, false);

        // This is POLYMORPHISM in action. We store different subclasses
        // in an array of the parent class type (Vehicle).
        Vehicle[] vehicles = { myCar, myMotorcycle };

        System.out.println("--- Operating Vehicles in the Garage ---\n");

        // Loop through the array and operate on each vehicle
        for (Vehicle v : vehicles) {
            // The v.toString() method called here is the one from the specific
            // subclass (Car or Motorcycle), not the one from Vehicle.
            System.out.println("--- Details: " + v.toString() + " ---");
            System.out.println("Current Fuel: " + v.getFuelLevel() + " gallons.");

            // The correct startEngine() method is called for each object
            // at runtime. This is the essence of polymorphism.
            v.startEngine();
            v.stopEngine();
            System.out.println(); // Add a blank line for readability
        }
    }
}