package Polymorphism;

class Shape {
    void area()
    {
        System.out.println("Area is :" );
    }
}
class Circle extends Shape{
    @Override
    void area()
    {
        System.out.println("Area of circle: ");
    }
}
class Tringle extends Shape{
    @Override
    void area()
    {
        System.out.println("Area of Tringle: ");
    }
}
class Square extends Shape{
    void area()
    {
        System.out.println("Area of circle: ");
    }
}
public class Shapes{
    public Shapes(){
        super();
    }

    void area()
    {
        System.out.println("IN MAIN CLASS");
    }
    public static void main(String[] args) {

        Shape S1 = new Shape();
        S1.area();

        Tringle Tringle = new Tringle();
        Circle Circle = new Circle();
        Square Square = new Square();

        Shape S2 = new Circle();
        S2.area();



    }
}




