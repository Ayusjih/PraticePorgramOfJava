//package Methods_in_Java;
//
//import Methods_in_Java.Class;
//
//public class GeometryDemo {
//
//    public static void main(String[] args) {
//        // We can create objects of concrete classes.
//        Shape myRectangle = new Rectangle("Blue", 10.0, 5.0);
//        Shape myCircle = new Circle("Red", 7.0);
//        Shape anotherCircle = new Circle("Green", 10); // Uses the overloaded constructor
//
//        // Create an array of Shape to demonstrate polymorphism.
//        Shape[] shapes = {myRectangle, myCircle, anotherCircle};
//
//        System.out.println("--- Displaying Shape Information ---");
//
//        // Loop through the array and call the same method on different objects.
//        for (Shape shape : shapes) {
//            shape.displayInfo(); // Polymorphism in action!
//            System.out.println("--------------------");
//        }
//    }
//}