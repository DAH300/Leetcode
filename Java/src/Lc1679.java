import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Lc1679 {

    public static class Solution {
        public int maxOperations2(int[] nums, int k) {

            Map<Integer, Integer> map = new HashMap<>();
            int maxOp = 0;

            for (int i = 0; i < nums.length; i++) {
                if (map.getOrDefault(k - nums[i], 0) > 0) {
                    maxOp++;
                    map.put(k - nums[i], map.get(k - nums[i]) - 1);
                } else {
                    map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
                }
            }
            return maxOp;
        }

        public int maxOperations(int[] nums, int k) {

            Arrays.sort(nums);
            int maxOp = 0;

            int left = 0;
            int right = nums.length - 1;

            for (int i = 0; i < nums.length; i++) {
                while (left < right) {
                    if (nums[left] + nums[right] > k) {
                        right--;
                    } else if (nums[left] + nums[right] < k) {
                        left++;
                    } else {
                        left++;
                        right--;
                        maxOp++;
                    }
                }
            }
            return maxOp;
        }
    }

    public static void main(String[] args) {

        // Example 1:
        // Input: nums = [1,2,3,4], k = 5
        // Output: 2
        // Explanation: Starting with nums = [1,2,3,4]:
        // - Remove numbers 1 and 4, then nums = [2,3]
        // - Remove numbers 2 and 3, then nums = []
        // There are no more pairs that sum up to 5, hence a total of 2 operations.

        // Example 2:
        // Input: nums = [3,1,3,4,3], k = 6
        // Output: 1
        // Explanation: Starting with nums = [3,1,3,4,3]:
        // - Remove the first two 3's, then nums = [1,4,3]
        // There are no more pairs that sum up to 6, hence a total of 1 operation.

        Solution sol = new Solution();

        int[] n1 = { 1, 2, 3, 4 };
        int k1 = 5;
        int[] n2 = { 3, 1, 3, 4, 3 };
        int k2 = 6;
        int[] n3 = { 2, 5, 4, 4, 1, 3, 4, 4, 1, 4, 4, 1, 2, 1, 2, 2, 3, 2, 4, 2 };
        int k3 = 3;

        System.out.println(sol.maxOperations(n3, k3));

    }

}
