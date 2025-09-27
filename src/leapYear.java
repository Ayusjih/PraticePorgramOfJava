public class leapYear {

    public static void main(String[] args)

    {
        int year  = 2023;

        System.out.println(((year%400==0 || year%4==0) && year%100!=0)?"leap year":"not leap year");


    }





}
