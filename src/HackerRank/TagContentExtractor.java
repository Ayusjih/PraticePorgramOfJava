package HackerRank;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class TagContentExtractor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        while (testCases-- > 0) {
            String line = sc.nextLine();
            boolean found = false;

            // Regex to match <tag>content</tag> where tags match and no nested tags inside
            Pattern pattern = Pattern.compile("<(.+?)>([^<>]+)</\\1>");
            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
                System.out.println(matcher.group(2)); // print content
                found = true;
            }

            if (!found) {
                System.out.println("None");
            }
        }
    }
}
