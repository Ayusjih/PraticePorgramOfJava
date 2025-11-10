package HackerRank;
import java.io.*;
import java.util.*;

public class JavaSubstring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        // substring(from, to) includes 'from' index but excludes 'to' index
        System.out.println(S.substring(start, end));
    }
}
