import java.util.Scanner;

public class terrnaryOpreator {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your first Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Your Second Number : ");
        int num2 = sc.nextInt();

        String ans = (num1<num2)?"True":"False";

        System.out.print("Is frist smaller than Second "+ans);
    }


}
