public class Lc0443 {

    public static class Solution {
        public int compress(char[] chars) {

            if (chars.length == 1) {
                return 1;
            }

            StringBuilder sb = new StringBuilder();
            int count = 0;
            char c = chars[0];

            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == c) {
                    count++;
                } else {
                    sb.append(String.valueOf(c));
                    if (count > 1) {
                        sb.append(String.valueOf(count));
                    }
                    c = chars[i];
                    count = 1;
                }
            }
            sb.append(String.valueOf(c));
            if (count > 1) {
                sb.append(String.valueOf(count));
            }

            for(int i = 0; i < sb.length(); i++){
                chars[i] = sb.charAt(i);
            }

            return sb.length();
        }
    }

    public static void main(String[] args) {

        // Example 1:
        // Input: chars = ["a","a","b","b","c","c","c"]
        // Output: Return 6, and the first 6 characters of the input array should be:
        // ["a","2","b","2","c","3"]
        // Explanation: The groups are "aa", "bb", and "ccc". This compresses to
        // "a2b2c3".

        // Example 2:
        // Input: chars = ["a"]
        // Output: Return 1, and the first character of the input array should be: ["a"]
        // Explanation: The only group is "a", which remains uncompressed since it's a
        // single character.

        // Example 3:
        // Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
        // Output: Return 4, and the first 4 characters of the input array should be:
        // ["a","b","1","2"].
        // Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to
        // "ab12".

        Solution sol = new Solution();

        char[] c1 = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        char[] c2 = { 'a' };
        char[] c3 = { 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b' };

        System.out.println(sol.compress(c3));
    }
}
