public class Lc0605 {

    public static class Solution {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {

            for (int i = 0; i < flowerbed.length; i++) {
                if (flowerbed[i] == 1) {
                    for (int j = i - 2 * n; j < i + n; j++) {
                        if (j >= 0 && i != j && j < flowerbed.length && flowerbed[j] == 1) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {

        // Example 1:
        // Input: flowerbed = [1,0,0,0,1], n = 1
        // Output: true

        // Example 2:
        // Input: flowerbed = [1,0,0,0,1], n = 2
        // Output: false

        Solution sol = new Solution();

        int[] f1 = { 1, 0, 0, 0, 1 };
        int n1 = 1;

        int[] f2 = { 1, 0, 0, 0, 1 };
        int n2 = 2;

        int[] f3 = { 1, 0, 0, 0, 0, 1 };
        int n3 = 2;
        // Output: true -> should be false

        System.out.println(sol.canPlaceFlowers(f3, n3));
    }
}
