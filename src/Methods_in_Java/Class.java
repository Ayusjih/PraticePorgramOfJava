package Methods_in_Java;
public class Class extends Shape {

    private double radius;


    public Class(String color, double radius) {
        super(color);
        this.radius = radius;
    }


    public Class(String color, int diameter) {
        // Calls the other constructor in the same class with the calculated radius.
        this(color, (double) diameter / 2.0);
        System.out.println("Created circle from diameter!");
    }

    public double getRadius() {
        return radius;
    }


    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}