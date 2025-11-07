package HackerRank;

import java.util.*;
import java.security.*;

public class JavaIntToStrg {
    public static void main(String[] args) {
        DoNotTerminate.forbidExit(); // Prevents System.exit()

        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();

            // Convert int to String
            String s = Integer.toString(n);
            // Or: String s = String.valueOf(n);

            // Verify correctness
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }

        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}

// The following class prevents you from terminating the code using System.exit