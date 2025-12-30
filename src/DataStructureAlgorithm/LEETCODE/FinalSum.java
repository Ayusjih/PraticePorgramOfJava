package DataStructureAlgorithm.LEETCODE;

import java.util.Arrays;

public class FinalSum {
    public boolean findSubarrays(int[] nums) {
        int n = nums.length;
        int[] sums = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            sums[i] = nums[i] + nums[i + 1];
        }

        Arrays.sort(sums);

        for (int i = 1; i < sums.length; i++) {
            if (sums[i] == sums[i - 1]) return true;
        }
        return false;
    }
}
