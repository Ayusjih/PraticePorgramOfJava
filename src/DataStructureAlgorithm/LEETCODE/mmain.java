package DataStructureAlgorithm.LEETCODE;




import java.lang.reflect.Array;
import java.util.ArrayList;
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

    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
                nums[i]=nums[i+1];
            }

        }
        int k = nums.length;
        System.out.println(k);
        return k;



    }





}

public class mmain {

    public static void main(String[] args) {
        int[] arrays={3,2,2,3};
        Solution s = new Solution();
        //s.removeDuplicates(arrays);
        s.removeElement(arrays,3);
       // s.plusOne(arrays);
    }
}


