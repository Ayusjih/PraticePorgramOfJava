import java.util.*;
public class Subarrays {



        static void allSubarrays(int[] arr) {
            int n = arr.length;

            for (int i = 0; i < n; i++) {
                List<Integer> current = new ArrayList<>();

                for (int j = i; j < n; j++) {
                    current.add(arr[j]);     // extend subarray
                    System.out.println(current);
                }
            }
        }


        public static void main(String[] args) {
        int [] arr = {1,2,5,3};
 /*       for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++)
            {
                System.out.println(arr[j]);
            }
            System.out.println();
        }*/
            Subarrays A = new Subarrays();
            allSubarrays(arr);


    }
}
