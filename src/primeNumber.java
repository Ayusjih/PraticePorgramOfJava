import java.util.Scanner;

public class primeNumber
{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            //int term = sc.nextInt();
            int term = 4;
            boolean isTrue = true;
            for (int i = 2; i < term; i++) {
                if (term % i == 0) {
                    isTrue = false;
                   // break;
                }

            }
            System.out.println((isTrue == true) ? "Prime" : "Not prime");

        }

    }
