package DataStructureAlgorithm.LEETCODE;

public class Equilibirum {// User function Template for Java


        int equalSum(int[] arr) {

            int n = arr.length;
            int[] preffix = new int[n];
            int[] suffix = new int [n];
            preffix[0] = arr[0];
            suffix[0] = arr[0];
            int ans =-1;

            for(int i =1;i<n;i++)
            {
                preffix[i] = preffix[i-1]+arr[i];
            }

            suffix[n-1]= arr[n-1];

            for(int i =n-2;i>=0;i--)
            {
                suffix[i] = suffix[i+1]+arr[i];
            }


            for(int i=0;i<n;i++)
            {
                if(preffix[i] == suffix[i])
                {
                    ans=i;
                    break;
                }
            }

            return ans;


        }
    }

