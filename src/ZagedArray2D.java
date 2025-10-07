import java.util.Arrays;
import java.util.Scanner;

public class ZagedArray2D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The no of rows");
        int m = sc.nextInt();
        int[][] arr = new int[m][];

        for (int i = 0;i<arr.length;i++)
        {
            System.out.println("enter the number of col");
            int n = sc.nextInt();
            arr[i]=new int[n];
            for(int j =0;j<arr[i].length;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int[] a: arr)
        {
            System.out.println(Arrays.toString(a));
        }


    }


}
