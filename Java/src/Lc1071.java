public class Lc1071 {
    public static class Solution {
        public String gcdOfStrings(String str1, String str2) {

            if(!(str1 + str2).equals(str2 + str1)){
                return "";
            }
            int gcdLength = gcd(str1.length(), str2.length());
            
            return str1.substring(0, gcdLength);
        }

        private int gcd(int l1, int l2){
            return l2 == 0 ? l1 : gcd(l2, l1 % l2);
        }
    }

    public static void main(String[] args) {

        // Example 1:
        // Input: str1 = "ABCABC", str2 = "ABC"
        // Output: "ABC"

        // Example 2:
        // Input: str1 = "ABABAB", str2 = "ABAB"
        // Output: "AB"

        // Example 3:
        // Input: str1 = "LEET", str2 = "CODE"
        // Output: ""

        Solution sol = new Solution();

        String s1 = "ABCABC";
        String s2 = "ABC";

        String s3 = "ABABAB";
        String s4 = "ABAB";

        String s5 = "LEET";
        String s6 = "CODE";

        System.out.println("The greatest common divisor of strings is " + sol.gcdOfStrings(s3, s4));
    }
}
