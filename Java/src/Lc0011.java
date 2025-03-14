public class Lc0011 {

    public static class Solution {
        public int maxArea(int[] height) {

            int p1 = 0;
            int p2 = height.length - 1;
            int largestArea = 0;
            int area = 0;

            while (p1 != p2) {
                area = Math.min(height[p1], height[p2]) * (p2 - p1);
                if (area > largestArea) {
                    largestArea = area;
                }
                if (height[p1] < height[p2]) {
                    p1++;
                } else {
                    p2--;
                }
            }
            return largestArea;
        }
    }

    public static void main(String[] args) {

        // Example 1:
        // Input: height = [1,8,6,2,5,4,8,3,7]
        // Output: 49
        // Explanation: The above vertical lines are represented by array
        // [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the
        // container can contain is 49.

        // Example 2:
        // Input: height = [1,1]
        // Output: 1

        Solution sol = new Solution();

        int[] h1 = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int[] h2 = { 1, 1 };

        System.out.println(sol.maxArea(h1));
    }
}
