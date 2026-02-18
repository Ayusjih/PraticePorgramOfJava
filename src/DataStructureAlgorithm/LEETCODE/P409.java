package DataStructureAlgorithm.LEETCODE;

public class P409 {

        public int longestPalindrome(String s) {
            HashMap<Character,Integer> mpp = new HashMap<>();
            boolean isodd = true;
            int sum=0;
            for (char c : s.toCharArray()) {

                mpp.put(c, mpp.getOrDefault(c, 0) + 1);
            }

            for(char h:mpp.keySet())
            {

                if(mpp.get(h)%2==0)
                {
                    sum += mpp.get(h);
                }
                else if(mpp.get(h)%2!=0)
                {
                    sum +=(mpp.get(h)-1);
                    if(isodd) {sum+=1; isodd = false;}
                }
            }

            return sum;

        }

}
