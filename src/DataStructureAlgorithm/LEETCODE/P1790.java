package DataStructureAlgorithm.LEETCODE;

public class P1790 {
    class Solution {
        public boolean areAlmostEqual(String s1, String s2) {

            if (s1.equals(s2)) {
                return true;
            }

            int first = -1, second = -1;
            int diffCount = 0;

            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    diffCount++;

                    if (diffCount == 1) {
                        first = i;
                    } else if (diffCount == 2) {
                        second = i;
                    } else {
                        return false; // More than 2 differences
                    }
                }
            }

            return diffCount == 2 &&
                    s1.charAt(first) == s2.charAt(second) &&
                    s1.charAt(second) == s2.charAt(first);
        }
    }
}
