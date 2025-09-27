import java.util.*;

public class armstrongWithWhile
{
    public static void main(String[] args)
    {   double sum=0;
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int org = number;
        String myString = String.valueOf(number);
        double length = myString.length();

        while(length!=0){
            double num =number%10;
            sum = sum + Math.pow(length,num);
            length = length/10;
        }
        System.out.println((sum == org)?"Here":"There");

    }


}