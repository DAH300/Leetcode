public class Lc0345 {

    public static class Solution {
        public String reverseVowels(String s) {

            char[] chars = s.toCharArray();
            String vowels = "AEIOUaeiou";
            int pointer1 = 0;
            int pointer2 = s.length() - 1;

            while (pointer1 < pointer2) {
                if (vowels.indexOf(chars[pointer1]) != -1) {
                    if (vowels.indexOf(chars[pointer2]) != -1) {
                        char temp = chars[pointer1];
                        chars[pointer1] = chars[pointer2];
                        chars[pointer2] = temp;
                        pointer1++;
                        pointer2--;
                    } else {
                        pointer2--;
                    }
                } else {
                    pointer1++;
                }
            }
            return new String(chars);
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

        System.out.println(sol.reverseVowels(s2));
    }
}