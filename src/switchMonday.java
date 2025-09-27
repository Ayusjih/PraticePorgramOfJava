import java.util.Scanner;
public class switchMonday   {
    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);
        String a=sc.nextLine();
        switch(a){
            case "Monday":
                System.out.println("valid day");
                break;
            case "Tuesday":
                System.out.println("valid day");
                break;

            case "Wednesday":
                System.out.println("valid day");
                break;
            case "Thrusday":
                System.out.println("valid day");
                break;
            case "Friday":
                System.out.println("valid day");
                break;
            case "Saturday":
                System.out.println("valid day");

            default:
                System.out.println("Its Sunday");


        }
    }
}
