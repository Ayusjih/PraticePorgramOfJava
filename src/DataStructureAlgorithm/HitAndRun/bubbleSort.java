package DataStructureAlgorithm.HitAndRun;

public class bubbleSort {
    public static void main(String[] args) {


        int [] nums ={1,4,2,6,2,6,8};
        int n = nums.length;

        for(int i =0;i<n-1;i++)
        {
            for(int j =0;j<n-i-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.println(nums[i]);
        }

    }

}
