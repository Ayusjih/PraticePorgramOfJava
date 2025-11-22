package DataStructureAlgorithm.LEETCODE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Sum3 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<List<Integer>> result2 = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    Collections.sort(temp);
                    if(temp.get(i)!=temp.get(i+1)){
                    result.add(temp);}

                }
            }
        }
        for (int i = 0; i < result.size(); i++) {
            List<Integer> triplet = result.get(i);
            int a = triplet.get(0);
            int b = triplet.get(1);
            int c = triplet.get(2);
            if (a + b + c == 0) {
                System.out.println("Found zero-sum triplet: " + triplet);
                result2.add(triplet);
            }

        }
        System.out.println(result2);
        return result2;
    }

    public static void main(String[] args) {
        int[] a = {-1, 0, 1, 2, -1, -4};
        Sum3 s = new Sum3();
        s.threeSum(a);
    }
}
