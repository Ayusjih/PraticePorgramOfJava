import java.util.Arrays;
import java.util.Scanner;

public class ForEachLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] arr = {"aa","bb","cc","dd"};

        System.out.println(Arrays.toString(arr));

        for(String a: arr)
        {
            System.out.println(a+" ");
        }
    }
}
