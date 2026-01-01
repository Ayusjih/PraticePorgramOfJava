package DataStructureAlgorithm.LEETCODE;

public class Array1920 {

        public int[] buildArray(int[] nums) {
            int n = nums.length;
            int[] ans = new int[n];
            for(int i=0;i<nums.length;i++)
            {
                for(int j=i;j<=i;j++)
                {
                    ans[j]=nums[nums[j]];
                }

            }
            return ans;
        }


    public int thirdMax(int[] nums) {
        int max1=0,max2=0,max3=0;
        for(int i=0;i<nums.length;i++)
        {
            if(max1<nums[i])
            {
                int temp = max1;
                int temp1=max2;
                max3 = temp1;
                max2=temp;
                max1=nums[i];
            }

        }
        return max3;

    }

    public static void main(String[] args) {
        int[] nums = {3,2,1};
            Array1920 a = new Array1920();
     //   a.buildArray();
        a.thirdMax(nums);
    }
}
