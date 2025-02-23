public class Lc0151 {
    public static class Solution {
        public String reverseWords(String s) {

            StringBuilder sb = new StringBuilder();
            String[] strings = s.split("\\s+");

            for (int i = 0; i < strings.length; i++) {
                    sb.append(strings[strings.length - i - 1] + " ");
            }
            return sb.toString().trim();
        }
    }

    public static void main(String[] args) {

        // Example 1:
        // Input: s = "the sky is blue"
        // Output: "blue is sky the"

        // Example 2:
        // Input: s = " hello world "
        // Output: "world hello"
        // Explanation: Your reversed string should not contain leading or trailing
        // spaces.

        // Example 3:
        // Input: s = "a good example"
        // Output: "example good a"
        // Explanation: You need to reduce multiple spaces between two words to a single
        // space in the reversed string.

        Solution sol = new Solution();

        String s1 = "the sky is blue";
        String s2 = " hello world ";
        String s3 = "a good example";

        System.out.println(sol.reverseWords(s3));
    }
}
