package DataStructureAlgorithm.LEETCODE;

import java.util.HashMap;

public class P217 {

        public boolean containsDuplicate(int[] arr) {
            HashMap<Integer,Integer> map = new HashMap<>();

            for(int i =0;i<arr.length;i++)
            {
                if(map.containsKey(arr[i]))
                {
                    int a = map.get(arr[i]);
                    map.put(arr[i],a+1);
                }
                else{
                    map.put(arr[i],1);
                }

            }
            for(int i: map.keySet())
            {
                if(map.get(i) > 1) return true;
            }

            return false;
        }
    }

