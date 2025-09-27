import java.util.Scanner;

public class palimdromeNumber {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 digit number : ");
        int orginialnumber = sc.nextInt();

        int number =orginialnumber;

        int unit = number%10;
        number = number/10;
        int tens = number%10;
        number = number/10;
        int hundred = number%10;
        number = number/10;

        int reverse = unit*100+tens*10+hundred;

        System.out.println((reverse == orginialnumber)?"Pallindrome":"Not Pallindrome");




    }

}
