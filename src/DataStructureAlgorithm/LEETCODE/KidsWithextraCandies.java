package DataStructureAlgorithm.LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class KidsWithextraCandies {
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

        for(int i=0;i<n;i++)
        {
           // if(max<=res)
            {
                List1.add(true);
            }
            //else
            {
                List1.add(false);
            }
        }
        System.out.println(res);
        return List1;

    }

    public static void main(String[] args) {
        KidsWithextraCandies kd =new KidsWithextraCandies();
        //kd.kidsWithCandies();
    }
}
