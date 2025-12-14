package DataStructureAlgorithm.LEETCODE;

public class HAPPYNUMBER {


        public boolean isHappy(int n) {
            while (n != 1 && n != 4) {
                int currentSum = 0;
                while (n > 0) {
                    int digit = n % 10;
                    currentSum += digit * digit;
                    n /= 10;
                }
                n = currentSum;
            }

            return n == 1;
        }

}
