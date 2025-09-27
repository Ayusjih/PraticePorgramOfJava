public class Increement_decreement {

    public static void main(String[] arhs)
    {
        int a = 22,b=22;

        System.out.println(a++ + --b );// a=22,b=21 ==43
        System.out.println(a++ + --a);// a =23, 23 = 46

        System.out.println(--a + b++); // a=22 + b =21 == 43 b 22
        System.out.println(a + --a);//22 + 21=43

        System.out.println(++a + --b); // a 22 , 21 = 43
        System.out.println(a++ + --a);//  22 + 22 = 44
        System.out.println(--a + ++b);//21+22=43
        System.out.println(a + a++);// 21 +21 = 42 , a=22

        System.out.println(a);// 22
        System.out.println(b+ a++);// b= 22, a=22
    }


}
