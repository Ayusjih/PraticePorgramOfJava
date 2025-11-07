package HackerRank;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();                // number of elements
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());          // reading list elements
        }

        int q = sc.nextInt();                // number of queries
        for (int i = 0; i < q; i++) {
            String query = sc.next();        // either "Insert" or "Delete"

            if (query.equals("Insert")) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                list.add(index, value);
            }
            else if (query.equals("Delete")) {
                int index = sc.nextInt();
                list.remove(index);
            }
        }

        sc.close();

        // print final list elements in one line separated by space
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}

