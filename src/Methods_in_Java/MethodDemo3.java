package Methods_in_Java;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MethodDemo3 {
    static Scanner sc = new Scanner(System.in);
    public static void Sumbmission(int a, int b)
    {
        System.out.println(a+b);
    }


    public static  void Array(List<Integer> List, int[] a)
    {
        System.out.println(Arrays.toString(a));
        System.out.println(List);
    }
    public  static  void   changeName(String name)
    {

        name = sc.nextLine();
        System.out.println("In Method "+name);
    }

    public static void main(String[] args) {


        String name = "Ayush";
        System.out.println("Before Method "+name);
        changeName(name);
        System.out.println("After Method "+name);

//        List<Integer>list1 = new ArrayList<>(5);
//        list1.add(2);
//        list1.add(2);
//        list1.add(3);
//        list1.add(4);
//        list1.add(5);
//        int[] a={2,5,6,7,8};
//        Sumbmission(12,14);
//        Array(list1,a);

    }








}
