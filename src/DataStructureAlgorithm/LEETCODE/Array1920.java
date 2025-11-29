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

    public static void main(String[] args) {
        Array1920 a = new Array1920();
        a.buildArray();
    }
}
