public class Lc0392 {

    public static class Solution {
        public boolean isSubsequence(String s, String t) {

            int p1 = 0;

            for (int i = 0; i < t.length() && p1 < s.length(); i++) {
                if (t.charAt(i) == s.charAt(p1)) {
                    p1++;
                }
            }
            return p1 == s.length();
        }
    }

    public static void main(String[] args) {

        // Example 1:
        // Input: s = "abc", t = "ahbgdc"
        // Output: true

        // Example 2:
        // Input: s = "axc", t = "ahbgdc"
        // Output: false

        Solution sol = new Solution();

        String s1 = "abc";
        String t1 = "ahbgdc";
        String s2 = "axc";
        String t2 = "ahbgdc";

        System.out.println(sol.isSubsequence(s1, t1));
        System.out.println(sol.isSubsequence(s2, t2));
    }

}
