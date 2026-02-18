package DataStructureAlgorithm.LEETCODE;

public class P890 {


        public String convert(String s)
        {
            HashMap<Character , Integer> mpp = new HashMap<>();
            int n = s.length();
            StringBuilder str =  new StringBuilder();
            int indx=0;
            for(int i=0;i<n;i++)
            {   char c = s.charAt(i);
                if(!mpp.containsKey(c))
                {
                    str.append(mpp.get(c));
                    mpp.put(c, indx++);

                }
                else
                {
                    str.append(mpp.get(c));
                }

            }

            return new String(str);

        }

        public List<String> findAndReplacePattern(String[] words, String pattern) {
            List<String> list = new ArrayList<>();

            String patt = convert(pattern);
            for(String word:words)
            {
                if(convert(word).equals(patt))
                {
                    list.add(word);
                }
            }

            return list;



        }

}
