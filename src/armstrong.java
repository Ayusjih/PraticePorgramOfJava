import java.util.Scanner ;
class check{
    int num , original;




}



public class armstrong {
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);
        //int num =  sc.nextInt();
        int num = 227;
        int original= num ;

        int number1 = num%10;
        num = num/10;
        int number2 = num%10;
        num = num / 10;
        int number3 = num%10;
        num = num/ 10;

        int result = number1*number1*number1 + number2*number2*number2+ number3*number3*number3;
        System.out.println((result==original)?"armstrong ":"notarmstrong");

    }
}