package DataStructureAlgorithm.LEETCODE;

public class P424 {
    class Solution {
        public int characterReplacement(String s, int k) {
            HashMap<Character,Integer> mpp = new HashMap<>();
            int n = s.length();
            int i=0,j=0;
            int maxi=0;
            int mf=0;
            while(j<n)
            {
                char ch = s.charAt(j);
                mpp.put(ch,mpp.getOrDefault(ch,0)+1);
                mf = Math.max(mf,mpp.get(ch));

                while((j-i+1)-mf>k)
                {
                    char c = s.charAt(i);
                    mpp.put(c,mpp.get(c)-1);
                    if(mpp.get(c)==0)
                    {
                        mpp.remove(c);
                    }
                    i++;
                }
                maxi = Math.max(maxi,j-i+1);
                j++;
            }
            return maxi;
        }
    }
}
