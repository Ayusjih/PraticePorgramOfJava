package Methods_in_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class demo2 {

    static Scanner sc = new Scanner(System.in);

    public static List<Integer> rollnumber(){

        int n = sc.nextInt();
        List<Integer> myList = new ArrayList<>();
        for(int i = 0;i<n;i++)
        {
            myList.add(sc.nextInt());
        }

        return myList;
    }


    public static void main(String[] args) {
        System.out.println(rollnumber());
    }

}
