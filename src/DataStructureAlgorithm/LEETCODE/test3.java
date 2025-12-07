package DataStructureAlgorithm.LEETCODE;

public class test3 {
    public int thirdMax(int[] nums) {
        int max1=0,max2=0,max3=0;
        for(int i=0;i<nums.length;i++)
        {
            if(max1<nums[i])
            {
                //sint temp = max1;
                int temp1=max2;
                max3 = temp1;
                //max2=temp;
                max1=nums[i];
            }

        }
        return max3;

    }


    public static void main(String[] args) {
        int[] num ={3,2,1};
        test3 s=new test3();
        s.thirdMax(num);


    }

}
