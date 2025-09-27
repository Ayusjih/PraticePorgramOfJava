import java.util.Scanner;


class numberChecker{
    int  number;
    public numberChecker(int number){

    }
}





public class positiveNegative {
    public static void main(String[] arhs)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your first Number : ");
        int num = sc.nextInt();


        String ans = (num>0)?"Positive":"Negative";
        System.out.println(ans);


    }

}
