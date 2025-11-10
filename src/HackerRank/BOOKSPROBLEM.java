package HackerRank;

// Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class BOOKSPROBLEM {
    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine(); // consume newline

        // Create a HashMap to store phone book entries
        Map<String, Integer> phoneBook = new HashMap<>();

        // Input: name and phone number pairs
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine(); // consume newline
            phoneBook.put(name, phone);
        }

        // Queries
        while (in.hasNext()) {
            String s = in.nextLine();
            if (phoneBook.containsKey(s)) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}

