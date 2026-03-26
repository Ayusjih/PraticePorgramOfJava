package DataStructureAlgorithm.LEETCODE;

public class P20 {
import java.util.Stack;

    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();

            for (char c : s.toCharArray()) {

                // Opening brackets → push
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                }
                else {
                    // No opening to match
                    if (stack.isEmpty()) return false;

                    char top = stack.pop();

                    // Check mismatch
                    if ((c == ')' && top != '(') ||
                            (c == '}' && top != '{') ||
                            (c == ']' && top != '[')) {
                        return false;
                    }
                }
            }

            // Must be empty at end
            return stack.isEmpty();
        }
    }

}
