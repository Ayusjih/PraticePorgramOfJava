package DataStructureAlgorithm.LEETCODE;




import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

class Solution {

    public int removeDuplicates(int[] nums) {
        int k=1;
        Arrays.sort(nums);
        for(int i = 1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                nums[k]=nums[i];
                k++;
            }
            else{
                continue;
            }
        }
        System.out.println(k);
        return k;
    }
}

public class mmain {

    public static void main(String[] args) {
        int[] arrays={1,2,3,4,7,77,1,3,4};
        Solution s = new Solution();
        s.removeDuplicates(arrays);

    }
}
