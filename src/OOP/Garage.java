package OOP;

public class Garage{
    public static void main(String[] args) {

        Car myCar = new Car("Honda", "Civic", 2024, 10.5, 50.0, 4);
        Motorcycle myMotorcycle = new Motorcycle("Royal Enfield", "Classic 350", 2022, 3.2, 13.0, false);

        System.out.println("--- Welcome to the OOP Garage ---\n");


        System.out.println("--- Operating Car: " + myCar + " ---");
        System.out.printf("Initial Fuel: %.2f / %.1f L%n", myCar.getFuelLevel(), myCar.getFuelCapacity());
        myCar.startEngine();


        myCar.drive(100);


        myCar.refuel(45);


        myCar.drive(800);

        myCar.stopEngine();
        System.out.println("\n-----------\n");



        System.out.println("Operating Motorcycle: " + myMotorcycle + "-");
        System.out.printf("Initial Fuel: %.2f / %.1f L%n", myMotorcycle.getFuelLevel(), myMotorcycle.getFuelCapacity());
        myMotorcycle.startEngine();


        myMotorcycle.drive(50);

        // Refuel it
        myMotorcycle.refuel(5);

        myMotorcycle.stopEngine();
    }
}
