package Methods_in_Java;

import java.util.Scanner;

public class demo1 {

    public demo1(int a)
    {
        System.out.println(a);
    }


    static Scanner sc = new Scanner(System.in);
    public void summation(){
        int a= sc.nextInt();
        int b =sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }

    public static void main(String[] args) {

        demo1 d = new demo1(2);
        d.summation();
        d.summation();
    }



}
