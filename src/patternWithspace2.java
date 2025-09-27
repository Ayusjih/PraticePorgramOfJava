import java.util.Scanner;

public class patternWithspace2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
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



    }



}
