import java.util.Scanner;

public class terrnaryOpreators {
    // (condition) ? " result 1 {if ture} " : " result 2 { If false} " ;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //String name = sc.next();
        //String name2 = sc.next();
     //   System.out.println((name==name2)?"True":"False");

       // char a = 'A', b='O';
     //   System.out.println((a==b)?"True":"False");

        int num = sc.nextInt();

        System.out.println((num%2==0)?"Even":"Odd");
    }

}
