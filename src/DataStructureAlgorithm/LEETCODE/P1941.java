package DataStructureAlgorithm.LEETCODE;

public class P1941 {

        public boolean areOccurrencesEqual(String s) {
            HashMap<Character,Integer> mpp = new HashMap<>();

            int value=0;
            for (char c : s.toCharArray()) {

                mpp.put(c, mpp.getOrDefault(c, 0) + 1);
                value = mpp.get(c);
            }





            for(char h:mpp.keySet())
            {

                if(mpp.get(h)!=value)
                {
                    return false;
                }
            }

            return true;


        }
    }
