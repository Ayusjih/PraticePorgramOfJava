import java.util.Scanner;
class Numberutil
{
    private int number;

    public Numberutil(int number)
    {
        this.number=number;
    }
    public int countDigi()
    {
        int n=number, count =0;
        while(n!=0)
        {
            n = n/10;
            count++;
        }
        return count;
    }

    public void Display()
    {
        System.out.println("Digit is "+countDigi());
    }

}


public class loopsConcept
{
    public static void main(String[] args)
    {

        Numberutil num = new Numberutil(252525);
        num.Display();
    }


}
