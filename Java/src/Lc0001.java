import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Lc0001 {

    public static class Solution {

        public int[] twoSum(int[] nums, int target) {

            Map<Integer, Integer> numMap = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                int diff = target - nums[i];

                if (numMap.containsKey(diff)) {
                    return new int[] { numMap.get(diff), i };
                }

                numMap.put(nums[i], i);

            }

            return null;
        }

        public int[] twoSumSimple(int[] nums, int target) {

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (j > i && nums[i] + nums[j] == target) {
                        return new int[] { i, j };
                    }
                }
            }

            return null;
        }
    }

    public static void main(String[] args) {

        // Example 1:
        // Input: nums = [2,7,11,15], target = 9
        // Output: [0,1]
        // Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

        // Example 2:
        // Input: nums = [3,2,4], target = 6
        // Output: [1,2]
        
        // Example 3:
        // Input: nums = [3,3], target = 6
        // Output: [0,1]

        int[] nums1 = { 2, 7, 11, 15 };
        int[] nums2 = { 3, 2, 4 };
        int[] nums3 = { 3, 3 };

        Solution sol = new Solution();

        System.out.println(Arrays.toString(sol.twoSum(nums1, 9)));
        System.out.println(Arrays.toString(sol.twoSum(nums2, 6)));
        System.out.println(Arrays.toString(sol.twoSum(nums3, 6)));

    }

}
