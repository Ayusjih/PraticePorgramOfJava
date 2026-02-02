package DataStructureAlgorithm.LEETCODE;

public class codeNinjaLongestSubarraySumK {

    int n = nums.length;
    int [] ans = new int[n-k+1];
    int j =0;
    int i =0;
    Deque<Integer> dq =new LinkedList<>();

		while(j<n)
    {
        sum +=nums[j];

        if(sum<k)
        {
            j++;
        }
        else if( sum == k)
        {

            max = Math.max(max,j-i+1);

            j++;
        }
        else if(sum>k)
        {
            while(sum>k)
            {
                sum -=nums[i];
                i++;


            }

            if(sum==k)
            {
                max = j-i+1;

                max = Math.max(max,sum);
            }
            j++;
        }
    }




}
