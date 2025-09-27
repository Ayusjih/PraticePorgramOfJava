import java.util.Scanner;

public class choppingMethod {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int ones = n%10;
        n =n/10;
        int tens = n%10;
        n =n/10;
        int hun = n%10;
        n =n/10;
        int th = n%10;
        n =n/10;

        int number  = ones*1000 + tens * 100+ 10*hun+ th;
        System.out.println(number);
        System.out.println(ones+"" + tens+""+ hun +""+th );
    }
}
