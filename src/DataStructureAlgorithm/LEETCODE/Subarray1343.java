package DataStructureAlgorithm.LEETCODE;

public class Subarray1343 {

        public int numOfSubarrays(int[] arr, int k, int threshold) {

            int n = arr.length;
            int sum =0;
            int j =0;
            int i =0;
            int count=0;

            int maxi = Integer.MIN_VALUE;

            while(j<n)
            {
                sum+=arr[j];
                if(j-i+1<k)
                {
                    j++;
                }

                else if(j-i+1==k)
                {
                    maxi=sum/k;
                    if(maxi >=threshold)
                    {
                        count++;
                    }

                    sum -=arr[i];
                    j++;
                    i++;

                }

            }

            return count;

        }
    }

