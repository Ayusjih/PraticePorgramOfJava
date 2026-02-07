package DataStructureAlgorithm.LEETCODE;

public class P448 {

        public List<Integer> findDisappearedNumbers(int[] nums) {

            HashSet<Integer> s1 = new HashSet<>();
            ArrayList<Integer> l1= new ArrayList<>();
            for(int i =0;i<nums.length;i++)
            {
                s1.add(nums[i]);
            }

            for(int i =1;i<=nums.length;i++)
            {
                if(!s1.contains(i))
                {
                    l1.add(i);
                }

            }



            return l1;
        }
    }

