import java.util.Scanner;
public class DivisibleBy4 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any number :");
        int number = sc.nextInt();

        int l1=number %10;
        number = number/10;
        int l2=number %10;
int l3 = l2*10+l1;
        System.out.println((l3%4==0)?"number divisi":"not");

    }


}
