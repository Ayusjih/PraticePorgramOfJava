package DataStructureAlgorithm.LEETCODE;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArthimeticSubarray {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {

        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < l.length; i++) {
            int start = l[i];
            int end = r[i];
            int len = end - start + 1;
            int[] temp = new int[len];

            for (int j = 0; j < len; j++) {
                temp[j] = nums[start + j];
            }

            Arrays.sort(temp);

            boolean isArithmetic = true;
            int diff = temp[1] - temp[0];

            for (int j = 1; j < len - 1; j++) {
                if (temp[j + 1] - temp[j] != diff) {
                    isArithmetic = false;
                    break;
                }
            }

            result.add(isArithmetic);
        }

        return result;
    }
}
