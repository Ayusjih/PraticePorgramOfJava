package DataStructureAlgorithm.LEETCODE;

public class RomanToInterger {

        public int romanToInt(String s) {
            int I=1,V=5,X=10,L=50,C=100,D=500,M=1000;
            int result = value(s.charAt(0));
            for(int i=1;i<s.length();i++)
            {

                if(value(s.charAt(i))>value(s.charAt(i-1)))
                {
                    int temp = value(s.charAt(i))-value(s.charAt(i-1));
                    result = result - value(s.charAt(i-1)) + temp ;
                }

                else
                {
                    result = result + value(s.charAt(i));
                }
            }
            System.out.println(result);
            return result;

        }

        private int value(char ch) {
            switch (ch) {
                case 'I': return 1;
                case 'V': return 5;
                case 'X': return 10;
                case 'L': return 50;
                case 'C': return 100;
                case 'D': return 500;
                case 'M': return 1000;
            }

            return 0;
        }

    public static void main(String[] args) {
        RomanToInterger t1 = new RomanToInterger();
        t1.romanToInt("III");
    }



    }

