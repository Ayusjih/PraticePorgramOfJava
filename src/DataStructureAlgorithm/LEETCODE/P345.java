package DataStructureAlgorithm.LEETCODE;

public class P345 {


        boolean isVowel(char left)
        {
            if(left =='a'||left =='e'||left =='i'||left =='o'||left =='u'|| left =='A'||left =='E'||left =='I'||left =='O'||left =='U')
            { return true;}
            return false;
        }

        public String reverseVowels(String s) {
            int i =0;
            int j = s.length()-1;
            char[] s2 =s.toCharArray();
            while(i<j)
            {
                while(i<j && !isVowel(s2[i])){
                    i++;
                }

                while(i<j && !isVowel(s2[j])){
                    j--;
                }

                char temp = s2[i];
                s2[i] = s2[j];
                s2[j] = temp;
                i++;
                j--;
            }

            return new String(s2);   }
    }




