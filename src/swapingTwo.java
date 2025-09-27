public class swapingTwo

{
    public static void main(String[] Args)
    {
        int a = 90,b=24;
        System.out.println("Value of a :"+a);
        System.out.println("Value of b :"+b);
        a^=b;
        b^=a;
        a^=b;
        System.out.println("Value of a :"+a);
        System.out.println("Value of b :"+b);
    }


}
