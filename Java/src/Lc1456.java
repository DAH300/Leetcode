public class Lc1456 {

    public static class Solution {
        public int maxVowels(String s, int k) {

            String vowels = "aeiou";

            int numVowels = 0;
            int maxVowels = 0;

            for (int i = 0; i < k; i++) {
                if (vowels.indexOf(s.charAt(i)) >= 0) {
                    numVowels++;
                }
            }
            maxVowels = numVowels;
            for (int i = k; i < s.length(); i++) {
                if (vowels.indexOf(s.charAt(i - k)) >= 0) {
                    numVowels--;
                }
                if (vowels.indexOf(s.charAt(i)) >= 0) {
                    numVowels++;
                    if (numVowels > maxVowels) {
                        maxVowels = numVowels;
                    }
                    if (maxVowels == k) {
                        return maxVowels;
                    }
                }
            }
            return maxVowels;
        }
    }

    public static void main(String[] args) {

        // Example 1:
        // Input: s = "abciiidef", k = 3
        // Output: 3
        // Explanation: The substring "iii" contains 3 vowel letters.

        // Example 2:
        // Input: s = "aeiou", k = 2
        // Output: 2
        // Explanation: Any substring of length 2 contains 2 vowels.

        // Example 3:
        // Input: s = "leetcode", k = 3
        // Output: 2
        // Explanation: "lee", "eet" and "ode" contain 2 vowels.

        Solution sol = new Solution();

        String s1 = "abciiidef";
        int k1 = 3;
        String s2 = "aeiou";
        int k2 = 2;
        String s3 = "leetcode";
        int k3 = 3;

        System.out.println(sol.maxVowels(s3, k3));
    }

}
