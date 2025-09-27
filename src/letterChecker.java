import java.util.Scanner;

public class letterChecker {

    public static void main(String[] args)
    { Scanner sc = new Scanner(System.in);
        char ch= sc.nextLine().charAt(0);
        System.out.println((ch>=65&&ch<=90)?"capital":"notcapital");
    }}
