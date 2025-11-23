package DataStructureAlgorithm.LEETCODE;

class Sol {
    public int searchInsert(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;


    }
}

public class SearchInsertPostion {
    public static void main(String[] args) {
        int[] are={1,9,8,2,4,1,5,8,4,26,2,5,2355,55,6,23,4,1,3,2,2};
        Sol s = new Sol();
        s.searchInsert(are,5);
    }
}
