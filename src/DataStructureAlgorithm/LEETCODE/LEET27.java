package DataStructureAlgorithm.LEETCODE;

public class LEET27 {


        public int removeElement(int[] nums, int val) {
            int i =0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != val) {
                    nums[i] = nums[j];
                    i++;
                }
            }

            return i;



        }

    public static void main(String[] args) {
            int[] arr = {1,3,3,3,3,3,3,2,3,3,4,5,6};
            LEET27 obj = new LEET27();
            obj.removeElement(arr,3);
    }


    }


