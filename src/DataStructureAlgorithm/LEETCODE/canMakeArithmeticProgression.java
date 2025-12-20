package DataStructureAlgorithm.LEETCODE;

import java.util.Arrays;

public class canMakeArithmeticProgression {

        public boolean CanMakeArithmeticProgression(int[] arr) {

            Arrays.sort(arr);
            int count =0;
            int sub = arr[1]-arr[0];
            for(int i =1;i<=arr.length-1;i++)
            {
                int ans = arr[i]-arr[i-1];
                if(ans==sub)
                {
                    count++;
                }

            }

            if(count==arr.length-1)
            {
                return true;
            }
            else
            {
                return false;
            }

        }

}
