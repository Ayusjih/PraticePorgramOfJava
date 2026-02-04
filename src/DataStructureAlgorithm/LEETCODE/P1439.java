package DataStructureAlgorithm.LEETCODE;

public class P1439 {


    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int maxx = 0, j = 0, i = 0, zero = 0;

        while (j < n) {
            if (nums[j] == 0) zero++;
            if (zero <= 1) {
                maxx = Math.max(maxx, j - i);
                j++;
            } else {
                while (zero > 1) {
                    if (nums[i] == 0) zero--;
                    i++;
                }

                maxx = Math.max(maxx, j - i);
                j++;

            }


        }
        return maxx;

    }
}



