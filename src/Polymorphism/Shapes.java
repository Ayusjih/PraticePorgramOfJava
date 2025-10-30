package Polymorphism;

class Shape {
    void area()
    {
        System.out.println("Area is :" );
    }

}

class Circle extends Shape{
    void area()
    {
        System.out.println("Area of circle: ");
    }
}
class Tringle extends Shape{
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
    void area()
    {
        System.out.println("IN MAIN CLASS");
    }

    public static void main(String[] args) {



    }
}




