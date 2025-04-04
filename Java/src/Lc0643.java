public class Lc0643 {

    public static class Solution {
        public double findMaxAverage(int[] nums, int k) {

            int sum = 0;
            int maxSum = Integer.MIN_VALUE;
            double maxAvg = 0;

            for (int i = 0; i < k; i++) {
                sum += nums[i];
            }
            maxSum = sum;
            for (int i = k; i < nums.length; i++) {
                sum += nums[i] - nums[i - k];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
            maxAvg = (double) maxSum / k;

            return maxAvg;
        }
    }

    public static void main(String[] args) {

        // Example 1:
        // Input: nums = [1,12,-5,-6,50,3], k = 4
        // Output: 12.75000
        // Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

        // Example 2:
        // Input: nums = [5], k = 1
        // Output: 5.00000

        Solution sol = new Solution();

        int[] n1 = { 1, 12, -5, -6, 50, 3 };
        int k1 = 4;
        int[] n2 = { 5 };
        int k2 = 1;
        int[] n3 = { 0, 1, 1, 3, 3 };
        int k3 = 4;

        System.out.println(sol.findMaxAverage(n3, k3));
    }

}
