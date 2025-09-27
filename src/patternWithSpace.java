import java.util.Scanner;


public class patternWithSpace {
       public static void main(String[] Args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int space1=5, star2 = 1,space3=9;

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
