package DataStructureAlgorithm.LEETCODE;

import java.util.HashMap;

public class TwoSumWithHashMap {

        public int[] twoSum(int[] nums, int target) {

            HashMap<Integer,Integer> mpp = new HashMap<>();
            int [] ans = new int[2];
            int n = nums.length;

            ans[0]=-1;
            ans[1]=-1;

        /*    for(int i =0;i<n;i++)
            {
                mpp.put(nums[i],i);
            }**/

            for(int i=0;i<n;i++)
            {
                int rem = target - nums[i];
                if(mpp.containsKey(rem) && mpp.get(rem)!= i)
                {
                    ans[0]=i;
                    ans[1]=mpp.get(rem);
                    break;
                }
                mpp.put(nums[i],i);
            }

            return ans;
        }
    }
