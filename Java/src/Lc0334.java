public class Lc0334 {

    public static class Solution {
        public boolean increasingTriplet(int[] nums) {

            int min = Integer.MAX_VALUE;
            int mid = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= min){
                    min = nums[i];
                }
                else if(nums[i] <= mid){
                    mid = nums[i];
                }
                else{
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {

        // Example 1:
        // Input: nums = [1,2,3,4,5]
        // Output: true
        // Explanation: Any triplet where i < j < k is valid.

        // Example 2:
        // Input: nums = [5,4,3,2,1]
        // Output: false
        // Explanation: No triplet exists.

        // Example 3:
        // Input: nums = [2,1,5,0,4,6]
        // Output: true
        // Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] ==
        // 4 < nums[5] == 6.

        Solution sol = new Solution();

        int[] n1 = { 1, 2, 3, 4, 5 };
        int[] n2 = { 5, 4, 3, 2, 1 };
        int[] n3 = { 2, 1, 5, 0, 4, 6 };
        int[] n4 = { 20, 100, 10, 12, 5, 13 };
        int[] n5 = { 0, 4, 2, 1, 0, -1, -3 };

        System.out.println(sol.increasingTriplet(n5));
    }
}
