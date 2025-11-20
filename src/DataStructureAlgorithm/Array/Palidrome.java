package DataStructureAlgorithm.Array;
public class Palidrome {
    public boolean isPalindrome(int y) {

        int rev=0;
        int x =y;
        while(x!=0)
        {
            rev= rev*10+x%10;
            x/=10;
        }

        if(rev ==y )
        {return true;}
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Palidrome t1 = new Palidrome();
        t1.isPalindrome(121);

    }


}
