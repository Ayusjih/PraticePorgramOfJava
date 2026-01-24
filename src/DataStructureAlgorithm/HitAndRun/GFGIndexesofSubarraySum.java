package DataStructureAlgorithm.HitAndRun;

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        int n = arr.length;
        ArrayList<Integer> list= new ArrayList<>();
        HashMap<Long, Integer> mpp = new HashMap<>();
        long prefix =0;

        for(int i = 0;i<n;i++)
        {
            prefix +=arr[i];
            if(prefix == target)
            {
                list.add(1);
                list.add(i+1);
                return list;
            }

            long rem = prefix - target;
            if(mpp.containsKey(rem))
            {
                list.add(mpp.get(rem)+2);
                list.add(i+1);
                return list;
            }

            mpp.put(prefix,i);

        }
        list.add(-1);
        return list;

    }
}
