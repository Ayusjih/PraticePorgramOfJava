package DataStructureAlgorithm.LEETCODE;

public class P2062 {

        public int countVowelSubstrings(String word) {
            int n = word.length();
            int count = 0;

            for (int i = 0; i < n; i++) {
                boolean[] seen = new boolean[5];
                int uniqueVowels = 0;

                for (int j = i; j < n; j++) {
                    char ch = word.charAt(j);

                    if (!isVowel(ch)) {
                        break;
                    }

                    int idx = getIndex(ch);
                    if (!seen[idx]) {
                        seen[idx] = true;
                        uniqueVowels++;
                    }

                    if (uniqueVowels == 5) {
                        count++;
                    }
                }
            }

            return count;
        }

        public boolean isVowel(char ch) {
            return ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u';
        }

        private int getIndex(char ch) {
            switch (ch) {
                case 'a': return 0;
                case 'e': return 1;
                case 'i': return 2;
                case 'o': return 3;
                case 'u': return 4;
            }
            return -1;
        }

}
