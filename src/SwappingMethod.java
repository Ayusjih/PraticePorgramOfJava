import java.util.SortedMap;

public class SwappingMethod {

    public static void main(String[] Args)
    {
     int a =98 ,b=78 ,temp= a , c =-12, d =82;
//using temp
     a = b;
     b = temp;
     System.out.println(a +" "+b);
// using Xor
     c =c^d;
     d=c^d;
     c=c^d;
        System.out.println(c +" "+d);
// without temp
      c= c+d;
      d=c-d;
      c=c-d;
        System.out.println(c +" "+d);


    }


}
