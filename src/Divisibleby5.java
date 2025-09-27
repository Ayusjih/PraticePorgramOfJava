import java.util.Scanner;
public class Divisibleby5 {
    public static void main(String[] Args){

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int n1 = number%10;
        System.out.println((n1==0 || n1 ==5)?"divisible by 5":" Not divisible by 5");



    }
}
// home working leap year