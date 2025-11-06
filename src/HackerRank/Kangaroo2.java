package HackerRank;

public class Kangaroo2 {


    public static String kangaroo(int x1, int v1, int x2, int v2) {

           int y1=x1;
           int y2=x2;
        for(int i =0;i<10000;i++) {
            if (y1 == y2) {
                System.out.println("yes");
            }

            y1 = y1 + v1;
            y2 = y2 + v2;

            if ((v1 > v2 && x1 > x2) || (v2 > v1 && x2 > x1)) {
                break;
            }
        }
        return "NO";

    }

    public static void main(String[] args) {

        kangaroo(0,2,3,2);

    }

}



