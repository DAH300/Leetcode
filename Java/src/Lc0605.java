public class Lc0605 {
    public static class Solution {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {

            if (n == 0) {
                return true;
            }

            int plotsNeeded = n;

            for (int i = 0; i < flowerbed.length; i++) {
                if (flowerbed[i] == 1) {
                    i++;
                } else if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                    i++;
                    plotsNeeded--;
                } else {
                    i += 2;
                }
                if (plotsNeeded == 0) {
                    return true;
                }
            }
            return false;
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

        int[] f4 = { 1, 0, 1, 0, 1, 0, 1 };
        int n4 = 0;

        int[] f5 = { 1, 0, 0, 0, 1, 0, 0 };
        int n5 = 2;

        System.out.println(sol.canPlaceFlowers(f3, n3));
    }
}
