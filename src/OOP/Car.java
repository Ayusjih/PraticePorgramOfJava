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
}
