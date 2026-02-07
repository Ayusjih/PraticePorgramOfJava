package DataStructureAlgorithm.LEETCODE;

public class P442 {

        public List<Integer> findDuplicates(int[] nums) {

            HashSet<Integer> s1 = new HashSet<>();
            ArrayList<Integer> l1= new ArrayList<>();


            for(int i =0;i<nums.length;i++)
            {
                if(s1.contains(nums[i]))
                {
                    l1.add(nums[i]);
                }
                s1.add(nums[i]);

            }



            return l1;
        }
    }


