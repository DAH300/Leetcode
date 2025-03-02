import java.util.Arrays;

public class Lc0238 {

    public static class Solution {
        public int[] productExceptSelf(int[] nums) {

            // int[] result = new int[nums.length];
            // Arrays.fill(result, 1);

            // for (int i = 0; i < nums.length; i++) {
            // for (int j = 0; j < nums.length; j++) {
            // if (i != j) {
            // result[i] *= nums[j];
            // }
            // }
            // }

            // return result;
            // }

            int[] result = new int[nums.length];
            Arrays.fill(result, 1);

            int pre = 1;
            for (int i = 0; i < nums.length; i++) {
                result[i] *= pre;
                pre *= nums[i];
            }

            int post = 1;
            for (int i = nums.length - 1; i >= 0; i--) {
                result[i] *= post;
                post *= nums[i];
            }
            return result;
        }
    }

    public static void main(String[] args) {

        // Example 1:
        // Input: nums = [1,2,3,4]
        // Output: [24,12,8,6]

        // Example 2:
        // Input: nums = [-1,1,0,-3,3]
        // Output: [0,0,9,0,0]

        Solution sol = new Solution();

        int[] n1 = { 1, 2, 3, 4 };
        int[] n2 = { -1, 1, 0, -3, 3 };

        System.out.println(Arrays.toString(sol.productExceptSelf(n1)));

    }

}
