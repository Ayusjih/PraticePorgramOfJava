import java.util.Scanner;
public class fibonacciSeries {

    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        int term = sc.nextInt();
        int initial =0, secondTerm = 1, thirdTerm ;
        System.out.println("Intial terms : "+initial+", "+ secondTerm);

        if(term == 0|| term == 1)
        {
            System.out.println(term);

        }


        for(int i = 2; i<term; i++)
        {

            thirdTerm = initial+secondTerm;
            //System.out.println(secondTerm+" "+thirdTerm);
            System.out.println(thirdTerm);
            initial = secondTerm;
            secondTerm= thirdTerm;


        }

    }

}
