import java.util.logging.SocketHandler;

public class Reverse {

public static void main(String[] args){

    int x = 10485;
    int reverse=0 ,remainder ;

    while(x!=0)
    {
        remainder = x%10;
        x = x /10;
        reverse = reverse*10 + remainder;
    }

    System.out.println(reverse);
}


}
