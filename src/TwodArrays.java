import java.util.Arrays;

public class TwodArrays {

    public static void main(String[] args) {

        int[][] arr = new int[40][50];
        int[][] arr1 = {{4,6,7,4},{8,7,1,5},
        {8,9,5,3}};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr1[0]));

        for(int i = 0 ; i<3;i++)
        {
            System.out.println(Arrays.toString(arr1[i]));
        }
        // user input
        for(int row = 0; row == arr1.length; row++)
        {
            for (int col =0; col< arr[row].length;col++)
            {
                arr[row][col]=2;
            }
        }

        for(int i = 0 ; i<3;i++)
        {
            System.out.println(Arrays.toString(arr1[i]));
        }


    }

}
