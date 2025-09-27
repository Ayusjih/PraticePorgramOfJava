import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo1
{

    public static void main(String[] args) {
        int[] student = new int[3];
        student[0] = 21;
        student[1] = 22;
        student[2] = 23;
        int [] array = {123,234,456,678,890};
        int[] arr = new int[] {111,112,113,114};

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(array));
        System.out.println(arr.length);
        int n = new Scanner(System.in).nextInt();
        int[] ans = new int[n];

        for(int i = 0;i<n;i++)
        {
            ans[i]=new Scanner(System.in).nextInt();
        }

        for(int i = 0;i<n;i++)
        {
            System.out.println(ans);
        }


    }
}
