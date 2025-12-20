package DataStructureAlgorithm.LEETCODE;

public class LengthOfLastWord58 {

        public int lengthOfLastWord(String s) {
            int len =s.length(),count=0;
            int i =len-1;

            for(i =len-1;i>=0;i--)
            {

                if (s.charAt(i) == ' ' && count == 0) {
                    continue;
                }


                if(s.charAt(i) != ' ')
                {
                    count++;
                }
                else
                {
                    break;
                }

            }
            return count;

        }
    }