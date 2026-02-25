package DataStructureAlgorithm.LEETCODE;

public class P367 {
    class Solution {



        public boolean isPerfectSquare(int num) {

            long left =1;
            long right =num;
            long mid = left +(right-left)/2;
            while(left<=right)
            {
                mid = left +(right-left)/2;

                if(mid*mid ==num) return true;
                else if(mid*mid>num)
                {
                    right = mid-1;
                }
                else
                {
                    left = mid+1;
                }
            }
            return false;

        }
    }
}
