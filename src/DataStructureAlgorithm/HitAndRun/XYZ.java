package DataStructureAlgorithm.HitAndRun;
class XYZ {
    public void moveZeroes(int[] nums) {

        int n = nums.length;
        int i = 0;
        int pos = 0;
        int j = n - 1, temp = 0;
        while (n != 0) {
            if (nums[i] == 0) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

            n--;
            i++;
            j--;

        }


    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i =m-1,j=n-1,k=m+n-1;


        for(int z=j ;z>=0;z--)
        {
            if(i>=0 && nums1[i]>nums2[j])
            {
                nums1[k]=nums1[i];
                i--;
                k--;

            }
            else{
                nums1[k]=nums2[j];
                j--;
                k--;
            }

        }

        while(j>=0)
        {
            nums1[k]=nums2[j];
            j--;
            k--;
        }


    }


    public static void main(String[] args) {
        int [] arr = {0,2,0,0,0,0};
        int [] arr2 = {1,1,1};
        XYZ a = new XYZ();
        a.merge(arr,3,arr2,3);
        //a.moveZeroes(arr);


    }
}
