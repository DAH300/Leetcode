public class Lc0345 {

    public static class Solution {
        public String reverseVowels(String s) {

            

            return s;
        }
    }

    public static void main(String[] args) {

        // Example 1:
        // Input: s = "IceCreAm"
        // Output: "AceCreIm"
        // Explanation:
        // The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes
        // "AceCreIm".

        // Example 2:
        // Input: s = "leetcode"
        // Output: "leotcede"
        
        Solution sol = new Solution();

        String s1 = "IceCreAm";
        String s2 = "leetcode";

        System.out.println(sol.reverseVowels(s1));
    }

}
