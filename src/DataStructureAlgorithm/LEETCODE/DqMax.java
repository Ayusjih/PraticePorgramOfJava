package DataStructureAlgorithm.LEETCODE;

public class DqMax {

        public int[] maxSlidingWindow(int[] nums, int k) {
            int n = nums.length;
            int [] ans = new int[n-k+1];
            int j =0;
            int i =0;
            Deque<Integer> dq =new LinkedList<>();


            while(j<n)
            {
                while(!dq.isEmpty() && nums[dq.peekLast()]<nums[j])
                {
                    dq.pollLast();
                }
                dq.offerLast(j);


                if(j-i+1<k){
                    j++;
                }
                else if(j-i+1==k)
                {
                    ans[i]=nums[dq.peekFirst()];
                    if(dq.peekFirst()==i)   dq.pollFirst();

                    i++;
                    j++;
                }


            }



            return ans;
        }
    }

