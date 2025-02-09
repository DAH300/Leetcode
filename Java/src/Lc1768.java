public class Lc1768 {

    public static class Solution {
        public String mergeAlternately(String word1, String word2) {

            StringBuilder mergedString = new StringBuilder();

            int i;
            int smallestWord = Math.min(word1.length(), word2.length());

            for(i = 0; i < smallestWord; i++){
                mergedString.append(word1.charAt(i));
                mergedString.append(word2.charAt(i));
            }
            if(word1.length() < i + 1){
                mergedString.append(word2, i, word2.length());
            }
            else{
                mergedString.append(word1, i, word1.length());
            }

            return mergedString.toString();
        }
    }

    public static void main(String[] args) {

        // Example 1:
        // Input: word1 = "abc", word2 = "pqr"
        // Output: "apbqcr"
        // Explanation: The merged string will be merged as so:
        // word1: a b c
        // word2: p q r
        // merged: a p b q c r

        // Example 2:
        // Input: word1 = "ab", word2 = "pqrs"
        // Output: "apbqrs"
        // Explanation: Notice that as word2 is longer, "rs" is appended to the end.
        // word1: a b
        // word2: p q r s
        // merged: a p b q r s

        // Example 3:
        // Input: word1 = "abcd", word2 = "pq"
        // Output: "apbqcd"
        // Explanation: Notice that as word1 is longer, "cd" is appended to the end.
        // word1: a b c d
        // word2: p q
        // merged: a p b q c d

        Solution sol = new Solution();

        String w1 = "abc";
        String w2 = "pqr";

        String w3 = "ab";
        String w4 = "pqrs";

        String w5 = "abcd";
        String w6 = "pq";

        System.out.println("The merged string is " + sol.mergeAlternately(w1, w2));

    }

}
