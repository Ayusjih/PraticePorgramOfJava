import java.util.*;

public class VeryBigSum {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int appleCount = 0;
        int orangeCount = 0;

        // count apples
        for (int d : apples) {
            int landingPos = a + d;
            if (landingPos >= s && landingPos <= t) {
                appleCount++;
            }
        }

        // count oranges
        for (int d : oranges) {
            int landingPos = b + d;
            if (landingPos >= s && landingPos <= t) {
                orangeCount++;
            }
        }

        System.out.println(appleCount);
        System.out.println(orangeCount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int t = sc.nextInt();

        int a = sc.nextInt();
        int b = sc.nextInt();

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] apples = new int[m];
        for (int i = 0; i < m; i++) {
            apples[i] = sc.nextInt();
        }

        int[] oranges = new int[n];
        for (int i = 0; i < n; i++) {
            oranges[i] = sc.nextInt();
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);
    }
}
