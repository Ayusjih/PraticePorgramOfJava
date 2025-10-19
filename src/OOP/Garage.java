package OOP;

public class Garage {
    public static void main(String[] args) {
        // --- Create instances with the new constructor (including fuel capacity) ---
        Car myCar = new Car("Honda", "Civic", 2024, 10.5, 50.0, 4);
        Motorcycle myMotorcycle = new Motorcycle("Royal Enfield", "Classic 350", 2022, 3.2, 13.0, false);

        System.out.println("--- Welcome to the OOP Garage ---\n");

        // --- Demonstrate Car's functionality ---
        System.out.println("--- Operating Car: " + myCar + " ---");
        System.out.printf("Initial Fuel: %.2f / %.1f L%n", myCar.getFuelLevel(), myCar.getFuelCapacity());
        myCar.startEngine();

        // Drive the car for 100km
        myCar.drive(100);

        // Refuel the car
        myCar.refuel(45);

        // Try to drive too far, which should result in a warning
        myCar.drive(800);

        myCar.stopEngine();
        System.out.println("\n----------------------------------------\n");


        // --- Demonstrate Motorcycle's functionality ---
        System.out.println("--- Operating Motorcycle: " + myMotorcycle + " ---");
        System.out.printf("Initial Fuel: %.2f / %.1f L%n", myMotorcycle.getFuelLevel(), myMotorcycle.getFuelCapacity());
        myMotorcycle.startEngine();

        // Drive the motorcycle for 50km
        myMotorcycle.drive(50);

        // Refuel it
        myMotorcycle.refuel(5);

        myMotorcycle.stopEngine();
    }
}
