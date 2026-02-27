package DataStructureAlgorithm.LEETCODE;

public class CielNumberBinarySearch {
    class Solution {
        public int findCeil(int[] arr, int x) {

            int low =0;
            int high = arr.length - 1;
            int ans=-1;

            while(low<=high)
            {   int mid = low +(high-low)/2;
                // if(x==0) return -1;
                if(arr[mid]==x)
                {
                    ans= mid;
                    high = mid-1;
                }
                else if(arr[mid]<x)
                {
                    low = mid+1;
                }
                else
                {   ans = mid;
                    high = mid-1;
                }
            }
            return ans;


        }
    }

}
