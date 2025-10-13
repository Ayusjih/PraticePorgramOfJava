package OOP;
class Car {
    private String model;
    private int year;
    private double speed; // Speed in km/h
    private boolean isEngineOn;

    // Constructor
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        this.speed = 0.0;
        this.isEngineOn = false;
    }

    // --- Getters ---
    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getSpeed() {
        return speed;
    }

    public boolean isEngineOn() { // For booleans, getters often start with "is"
        return isEngineOn;
    }

    // --- Methods that change the state ---
    public void startEngine() {
        if (!isEngineOn) {
            this.isEngineOn = true;
            System.out.println("Engine started.");
        } else {
            System.out.println("Engine is already on.");
        }
    }

    public void stopEngine() {
        if (isEngineOn) {
            this.isEngineOn = false;
            this.speed = 0; // Car stops when engine is off
            System.out.println("Engine stopped.");
        } else {
            System.out.println("Engine is already off.");
        }
    }
    public void accelerate(double amount) {
        if (isEngineOn) {
            this.speed += amount;
            System.out.println(this.model + " is now moving at " + this.speed + " km/h.");
        } else {
            System.out.println("Cannot accelerate, the engine is off.");
        }
    }
    public void brake(double amount) {
        if (speed > 0) {
            this.speed -= amount;
            if (this.speed < 0) {
                this.speed = 0;
            }
            System.out.println("Braking. Speed is now " + this.speed + " km/h.");
        } else {
            System.out.println("The car is already stationary.");
        }
    }
    public class CarDemo {
        public static void main(String[] args) {
            Car myCar = new Car("Honda Civic", 2023);

            System.out.println("My car is a " + myCar.getYear() + " " + myCar.getModel());

            myCar.accelerate(50); // Fails because engine is off
            myCar.startEngine();
            myCar.accelerate(50);
            myCar.accelerate(30);
            myCar.brake(40);
            myCar.stopEngine();
        }
}

}
