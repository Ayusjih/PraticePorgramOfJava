package DataStructureAlgorithm.LEETCODE;

public class P383 {
    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            int[] count = new int[26]; // for 'a' to 'z'

            // Count characters in magazine
            for (char c : magazine.toCharArray()) {
                count[c - 'a']++;
            }

            // Try to build ransomNote
            for (char c : ransomNote.toCharArray()) {
                count[c - 'a']--;

                if (count[c - 'a'] < 0) {
                    return false; // not enough characters
                }
            }

            return true;
        }
    }
}
