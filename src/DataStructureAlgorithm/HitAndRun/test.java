package DataStructureAlgorithm.HitAndRun;


import jdk.jshell.execution.JdiDefaultExecutionControl;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.reverse;

class test1 {
     public int[] plusOne(int[] digits) {
         int sum=0;
         int [] ress = new int[digits.length];
         //int[] res = new int[digits.length];
         for(int i=0;i<digits.length;i++)
         {
            sum = (10*sum+digits[i]);
         }
         sum++;
         System.out.println(sum);
         String intAsString = Integer.toString(sum);
         StringBuilder str = new StringBuilder();
        str.append(intAsString);
        int length= str.length();
        for(int i=0;i<length;i++)
        {
            int temp = sum%10;
            sum=sum/10;
            digits[length-i-1]=temp;
        }

        /*for(int i =length-1;i>0;i--)
        {
            ress[length-i]=digits[i];
        }
*/
         for(int i=0;i<digits.length;i++)
         {
             System.out.println(digits[i]);
         }

         return digits;



     }

    public int[] plustwo(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }






        public int getSecondLargest(int[] arr) {

            Arrays.sort(arr);
            int a=arr[2],res=0;

            for(int i=arr.length-1;i>0;i--)
            {
                if(arr[i]!=a)
                {
                    res =arr[i];
                    break;
                }



            }

            System.out.println(res);
            return res;


    }


        public int missingNumber(int[] nums) {
            Arrays.sort(nums);
            int res = 0;
            int j =0;


            for(int i =0;i<nums.length;i++)
            {
                res= res +nums[i];
                j+=j;
                j++;
            }

            res = j-res;
            return res;

        }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> List1 = new ArrayList<>();
        int n=candies.length,max=0;
        int[] res=new int[n];

        for(int i =0;i<candies.length;i++)
        {
            res[i]+=extraCandies;

        }


        for(int i=0;i<candies.length;i++)
        {
            if(max <candies[i])
            {max=candies[i];}

        }

        /*for(int i=0;i<n;i++)
        {
            if(max<=res.get(i))
            {
                List1.add(true);
            }
            else
            {
                List1.add(false);
            }
        }*/
        System.out.println(res);
        return List1;

    }
    }

public class test{

     static int[] are={0,3,1};
    public static void main(String[] args) {
        test1 t = new test1();
       // t.plusOne(are);
        //t.plustwo(are);
      //  t.getSecondLargest(are);
     //   t.missingNumber(are);
        t.kidsWithCandies(are,2);
    }
}