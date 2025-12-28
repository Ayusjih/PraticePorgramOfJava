package DataStructureAlgorithm.LEETCODE;

public class cirularSubarray {

        public int maxSubarraySumCircular(int[] nums) {

            int n =nums.length,min_sum=0,max_sum=0,max=Integer.MIN_VALUE,min =Integer.MAX_VALUE,total=0;

            for(int i=0;i<n;i++){
                max_sum +=nums[i];
                min_sum +=nums[i];
                if(max_sum>max)
                {
                    max = max_sum;
                }
                if(max_sum<0)
                {
                    max_sum =0;
                }


                if(min_sum<min)
                {
                    min = min_sum;
                }
                if(min_sum>0)
                {
                    min_sum =0;
                }

                total+=nums[i];
            }

            int circularsum = total-min;
            int ans=Math.max(max,circularsum);

            //min = Math.abs(min);
            if(max<0) return max;
            return ans;





        }

}
