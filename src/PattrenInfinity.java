

public class PattrenInfinity {

    public static void main(String[] args) {
        int n = 5;
        for(int i = 0 ; i<n ;i++)
        {
            for(int j = 0; j<i;j++)
            {
                System.out.print("*");
            }

            for(int j = 1;j<=i;j=2)
            {
                System.out.print(j);
            }
            for (int j =n;j>0;j--)
            {
                System.out.print(j);
            }
            System.out.println();

        }
    }

}
