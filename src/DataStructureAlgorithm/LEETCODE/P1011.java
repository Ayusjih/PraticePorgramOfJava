package DataStructureAlgorithm.LEETCODE;

public class P1011 {
    class Solution {

        public int High(int[] weights)
        {   int sum =0;
            for(int i=0;i<weights.length;i++)
            {
                sum+=weights[i];
            }
            return sum;
        }
        public int Maximum(int[] weights) {
            int maxi = weights[0];
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] > maxi) {
                    maxi = weights[i];
                }
            }
            return maxi;
        }

        public int isPossible(int[] weights,int mid)
        {
            int n = weights.length;
            int day =1;
            int sum =0;
            for(int i =0;i<n;i++){
                if(sum+weights[i]>mid)
                {
                    day++;
                    sum=weights[i];
                }
                else
                {
                    sum+=weights[i];
                }
            }
            return day;
        }



        public int shipWithinDays(int[] weights, int days) {
            int low = Maximum(weights);
            int high = High(weights);
            while(low<=high)
            {
                int mid = low + (high-low)/2;
                if(isPossible(weights,mid)<=days)
                {
                    high= mid-1;
                }
                else{
                    low=mid+1;
                }
            }

            return low;

        }
    }
}
