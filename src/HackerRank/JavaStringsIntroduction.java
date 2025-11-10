package HackerRank;
import java.io.*;
import java.util.*;

public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        // 1️⃣ Print the sum of lengths
        System.out.println(A.length() + B.length());

        // 2️⃣ Determine if A is lexicographically greater than B
        if (A.compareTo(B) > 0)
            System.out.println("Yes");
        else
            System.out.println("No");

        // 3️⃣ Capitalize the first letter of both A and B
        String capA = A.substring(0,1).toUpperCase() + A.substring(1);
        String capB = B.substring(0,1).toUpperCase() + B.substring(1);

        System.out.println(capA + " " + capB);
    }
}
