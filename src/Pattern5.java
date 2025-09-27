public class Pattern5 {
    public static void main(String[] args) {

        int n = 5;

      /*  for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");

            while(i==4)
            {
                for ( int z = 0; z < n; z++) {
                    for (int j = 5; j >z; j--) {
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                i++;
            }


        }*/
/*
        for(int i=0;i<2*n-1;i++)
        {
            int size=i+1;
            if(i>=n)
            {
                size = 2*n-i-1;
            }

            for(int j =0;j<size;j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }*/
        for(int i =0;i<n;i++)
        {   if(i%2==0){
            for(int j=0;j<2*i-1;j++)
            {
                System.out.println(0);
            }
        }

        }

    }


}