package DataStructureAlgorithm.LEETCODE;

public class MaxSubarrayProduct {

    public int maxProduct(int[] nums) {
        int n = nums.length;
        int pre =1,suff =1,ans = Integer.MIN_VALUE;
        for(int i =0;i<n;i++)
        {
            if(pre==0) pre=1;
            if(suff==0) suff=1;

            pre=pre*nums[i];
            suff=suff*nums[(n-i-1)];
            ans = Math.max(ans,Math.max(pre,suff));
        }
        return ans;
    }

    public int maxProduct1(int[] nums) {
        int n = nums.length, maxi=nums[0];
        int curMin=nums[0],curMax=nums[0];

        for(int i =1;i<n;i++)
        {

            if(nums[i]<0)
            {
                int temp = curMax;
                curMax=curMin;
                curMin=temp;
            }


            curMax = Math.max(nums[i],nums[i]*curMax);
            curMin = Math.min(nums[i],nums[i]*curMin);
            if(curMax>maxi) maxi = curMax;


        }



        return maxi;



    }

}
