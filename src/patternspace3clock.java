import java.util.Scanner;


public class patternspace3clock {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        int space1=5, star2 = 1,space3=9;

        int n = sc.nextInt();
        for(int i = 0 ; i<=n;i++)
        {
            for(int j = 0;j<i;j++ )
            {
                System.out.print(" ");

            }
            for (int z =n; z>=2*i+1; z--)
            {
                System.out.print("*");

            }

            System.out.print("\n");

        }
        for(int i = 1; i<=n;i++)
        {
            for(int j =1 ; j<=space1;j++)
            {
                System.out.print(" ");

            }
            space1--;
            for(int z = 1; z<=2*i - 1;z++)
            {
                System.out.print("*");

            }star2++;

            System.out.print("\n");
        }
    }
}
