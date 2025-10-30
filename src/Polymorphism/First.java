package Polymorphism;

public class First {

    int sum(int a,int b)
    {
        return a+b;
    }
    double sum(int a, double b)
    {
        return a+b;
    }
    double sum(int a, double b, float c)
    {
        return a+b;
    }
    double sum( double b,int r, float c)
    {
        return r+b;
    }
}
