package Methods_in_Java;
public abstract class Shape {

    // Using 'protected' allows subclasses to access this field directly.
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    // A concrete method available to all subclasses.
    public String getColor() {
        return color;
    }
    public abstract double calculateArea();
    public void displayInfo() {
        System.out.println("Shape: " + this.getClass().getSimpleName());
        System.out.println("Color: " + this.color);
        // The correct calculateArea() is called based on the object's actual type.
        System.out.printf("Area: %.2f%n", this.calculateArea());
    }
public class Rectangle extends Shape {

    // Private fields to encapsulate the state of the Rectangle.
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        // Call the constructor of the superclass (Shape).
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
}