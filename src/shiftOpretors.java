import java.lang.Math;


public class shiftOpretors {

    public static void main(String[] Args)
    {
//8<<2 a=8,b=2;
    // a*2^b Left shift
        // a/(2^b) for right shift

    int a = 8, b=2;
    int d = a >> b;
    System.out.println(d);

    double result = a/Math.pow(2 , b);
    System.out.println(result);

    }


}
