package DataStructureAlgorithm.HitAndRun;

class Solution {

}

public class Main {
    public int romanToInt(String s) {
        int I=1,V=5,X=10,L=50,C=100,D=500,M=1000;
        int result=0;
        for(int i=0;i<s.length();i++)
        {
            if(i>0)
            {
                if(s.charAt(i)>s.charAt(i-1))
                {
                    int temp = s.charAt(i)-s.charAt(i-1);
                    result = temp;
                }

                else
                {
                    result = result + s.charAt(i);
                }




            }


        }
        System.out.println(result);
        return result;

    }

    public static void main(String[] args) {
        Main m1 = new Main();
        m1.romanToInt("III");
    }

}
