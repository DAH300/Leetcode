import java.util.HashMap;
import java.util.Map;

public class Lc0003 {

    public static class Solution {
        public int lengthOfLongestSubstring(String s) {

            Map<Character, Integer> charMap = new HashMap<>();
            int longestSubLen = 0;
            int currentLongestSubLen = 0;

            for (int i = 0; i < s.length(); i++) {
                if (!charMap.containsKey(s.charAt(i))) {
                    charMap.put(s.charAt(i), i);
                    currentLongestSubLen++;
                } else {
                    if (currentLongestSubLen > longestSubLen) {
                        longestSubLen = currentLongestSubLen;
                    }
                    currentLongestSubLen = 0;
                    i = charMap.get(s.charAt(i));
                    charMap.clear();
                }
            }
            if (currentLongestSubLen > longestSubLen) { // last char being part of longest substring
                longestSubLen = currentLongestSubLen;
            }
            return longestSubLen;
        }

    }

    public static void main(String[] args) {

        // Example 1:
        // Input: s = "abcabcbb"
        // Output: 3
        // Explanation: The answer is "abc", with the length of 3.

        // Example 2:
        // Input: s = "bbbbb"
        // Output: 1
        // Explanation: The answer is "b", with the length of 1.

        // Example 3:
        // Input: s = "pwwkew"
        // Output: 3
        // Explanation: The answer is "wke", with the length of 3.
        // Notice that the answer must be a substring, "pwke" is a subsequence and not a
        // substring.

        Solution sol = new Solution();

        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        String s4 = "aab";
        String s5 = "jbpnbwwd";

        int longestSubLen = sol.lengthOfLongestSubstring(s5);
        System.out.println(longestSubLen);
    }

}
