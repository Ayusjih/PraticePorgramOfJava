package HackerRank;

public class Kangaroo {


    public static String kangaroo(int x1, int v1, int x2, int v2) {

        int y1 = x1+v1;
        int y2 = x2+v2;
        if(x1<10000 && x2<10000){
            if(y1!=y2)
            {
                x1= y1;
                x2 = y2;
                kangaroo(x1, v1, x2, v2);

            }

            else{
                System.out.println("YES");
            }

        }
        else{
            System.out.println("NO");
        }

        return " ";

    }

    public static void main(String[] args) {

        kangaroo(0,2,3,2);

    }

}



