import java.util.Scanner;
public class swtichStatement   {
    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        switch(a){
            case 1:
                System.out.println("Aman Gupta");
                break;
            case 2:
                System.out.println("Ashutosh Agarwal");
                break;

            case 3:
                System.out.println("Aman bhadoria");
                break;
            case 4:
                System.out.println("Ayush Ojha");
                break;
                case 5:
                System.out.println("Atul Sharma");
                    break;

            default:
                System.out.println("Arpit Punhani");


        }
    }
}
