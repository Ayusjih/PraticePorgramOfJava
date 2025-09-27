import java.util.Scanner;
public class leapyear1 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        int num=sc.nextInt();
        int number=num;

        System.out.println(((number%400==0||number%4==0) &&number%100!=0)? "leap year":"not a leap year");
    }
}
