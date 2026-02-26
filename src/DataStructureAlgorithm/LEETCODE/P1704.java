package DataStructureAlgorithm.LEETCODE;

public class P1704 {

        public boolean halvesAreAlike(String s) {
            int n = s.length() / 2;
            int count = 0;

            for (int i = 0; i < n; i++) {
                if (isVowel(s.charAt(i))) {
                    count++;
                }
                if (isVowel(s.charAt(i + n))) {
                    count--;
                }
            }

            return count == 0;
        }

        private boolean isVowel(char c) {
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
        }

}
