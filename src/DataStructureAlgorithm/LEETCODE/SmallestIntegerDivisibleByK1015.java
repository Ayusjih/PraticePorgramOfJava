package DataStructureAlgorithm.LEETCODE;

public class SmallestIntegerDivisibleByK1015 {

    public int smallestRepunitDivByK(int k) {
        if (k % 2 == 0 || k % 5 == 0)
        {
            return -1;
        }

        int remainder = 0;
        for (int len = 1; len <= k; len++) {
            remainder = (remainder * 10 + 1) % k;
            if (remainder == 0) return len;
        }
        return -1;
    }

    public static void main(String[] args) {

        SmallestIntegerDivisibleByK1015 s1 = new SmallestIntegerDivisibleByK1015();
        s1.smallestRepunitDivByK(23);
    }


}
