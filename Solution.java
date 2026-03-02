class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        int j =0;


        for(int i =0;i<nums.length;i++)
        {
           res= res +nums[i];
            j+=j;
            j++;
                }

        res = j-res;
        return res;

    }
}