import java.util.Scanner;
public class StringInput {

    public static void main(String[] args)
    {
        System.out.println("Enter your name");
        Scanner sc = new  Scanner(System.in);
        String n = sc.nextLine();

        System.out.println("Name is :" + n);
    }
}
