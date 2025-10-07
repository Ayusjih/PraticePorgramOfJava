import java.lang.reflect.*;
import java.util.Scanner;
import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
int[][] arr1= new int[3][2];
    for(int i =0; i<3;i++)
    {
        for(int j = 0;j<2;j++)
        {
            arr1[i][j]=sc.nextInt();
        }
    }


        int[] [] array = {{1,2,3},{2,3,4},{3,4,5}};
        for(int [] ar: array){
            System.out.println(Arrays.toString(ar));
        }

    }


}
