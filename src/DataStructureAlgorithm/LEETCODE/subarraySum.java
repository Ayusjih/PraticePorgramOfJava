package DataStructureAlgorithm.LEETCODE;

import java.util.HashMap;

public class subarraySum {

        public int subarraySum1(int[] nums, int k) {

            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0, 1);   // base case: sum = 0 occurs once

            int sum = 0;
            int count = 0;

            for (int num : nums) {
                sum += num;

                if (map.containsKey(sum - k)) {
                    count += map.get(sum - k);
                }

                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }

            return count;
        }
    }


