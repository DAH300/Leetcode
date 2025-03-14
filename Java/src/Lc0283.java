import java.util.Arrays;

public class Lc0283 {
    public static class Solution {
        public void moveZeroes(int[] nums) {
            int consecZeroes = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    consecZeroes++;
                } else if (consecZeroes > 0) {
                    int p1 = nums[i];
                    nums[i] = 0;
                    nums[i - consecZeroes] = p1;
                }
            }
        }
    }

    public static void main(String[] args) {

        // Example 1:
        // Input: nums = [0,1,0,3,12]
        // Output: [1,3,12,0,0]

        // Example 2:
        // Input: nums = [0]
        // Output: [0]

        Solution sol = new Solution();

        int[] n1 = { 0, 1, 0, 3, 12 };
        int[] n2 = { 0 };
        int[] n3 = { 0, 0, 1 };

        sol.moveZeroes(n3);
        System.out.println(Arrays.toString(n3));
    }
}