package DataStructureAlgorithm.LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                res.add(nums[i]);
            }
        }
        int k =res.size();

        for(int i = 0;i<res.size();i++)
        {
            nums[i]=res.get(i);
        }
        return k;
    }

    public static void main(String[] args)
    {
        int[] array = {1,2,4,5,6};
        RemoveElement r1= new RemoveElement();
        r1.removeElement(array,3);

    }





}
