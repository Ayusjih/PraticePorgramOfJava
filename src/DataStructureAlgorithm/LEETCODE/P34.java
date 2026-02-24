package DataStructureAlgorithm.LEETCODE;

public class P34 {
    class Solution {
        public int Frist(int [] nums,int t)
        {
            int low = 0;
            int high = nums.length -1;
            int mid = low+(high-low)/2;
            int ans = -1;

            while(low<=high)
            {
                mid = low+(high-low)/2;

                if(nums[mid]==t)
                {
                    ans = mid;
                    high = mid-1;
                }
                else if(nums[mid]<t)
                {
                    low = mid+1;

                }
                else
                {
                    high = mid -1;
                }

            }


            return ans;


        }


        public int Second(int [] nums,int t)
        {
            int low = 0;
            int high = nums.length -1;
            int mid = low+(high-low)/2;
            int ans = -1;

            while(low<=high)
            {
                mid = low+(high-low)/2;

                if(nums[mid]==t)
                {
                    ans = mid;
                    low = mid+1;
                }
                else if(nums[mid]<t)
                {
                    low = mid+1;

                }
                else
                {
                    high = mid -1;
                }

            }


            return ans;
        }


        public int[] searchRange(int[] nums, int target) {
            int low = 0;
            int high = nums.length -1;
            int mid = low+(high-low)/2;
            int ans = -1;
            int[] arr = new int[2];
            arr[0] = Frist(nums,target);
            arr[1]= Second(nums,target);

            return arr;




        }
    }
}
