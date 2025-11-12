package Polymorphism;

public class Second {

    void sum(int a,int b)    {
        System.out.println("A");
    }
    void sum(int a , int b, int c)
    {
        System.out.println("B");
    }
    void sum(double a, double b)
    {
        System.out.println("C");
    }
    public static void main(String[] args) {

        Second S= new Second();

        S.sum(2,2.5);
    }
}
