package DataStructureAlgorithm.LEETCODE;

public class MissingNumber168 {

        public int missingNumber(int[] nums) {

            int res = 0;
            int j =nums.length;
            int sum = (j*(j+1))/2;

            for(int i =0;i<=nums.length-1;i++)
            {
                res= res +nums[i];
            }

            res = sum-res;
            System.out.println(res);
            return res;

        }


    public static void main(String[] args) {

            int[] are ={0,3,1};
            MissingNumber168 m =new  MissingNumber168();
        m.missingNumber(are);
    }


}
