package DataStructureAlgorithm.LEETCODE;

public class Kadane_MAX_ABS_SUBARRAY_SUM {

        public int maxAbsoluteSum(int[] nums) {

            int n =nums.length,min_sum=0,max_sum=0,max=Integer.MIN_VALUE,min =Integer.MAX_VALUE;

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


            }
            min = Math.abs(min);
            int ans=Math.max(max,min);



            return ans;


        }

        public int maxAbsoluteSum_better(int[] nums) {

            int n =nums.length,sum=0,max=Integer.MIN_VALUE,min =Integer.MAX_VALUE;

            for(int i=0;i<n;i++){
                sum +=nums[i];
                if(sum>max)
                {
                    max = sum;
                }
                if(sum<0)
                {
                    sum =0;
                }

            }
            sum=0;
            for(int i=0;i<n;i++){
                sum +=nums[i];
                if(sum<min)
                {
                    min = sum;
                }
                if(sum>0)
                {
                    sum =0;
                }

            }
            min = Math.abs(min);
            int ans=Math.max(max,min);



            return ans;


        }
    }







