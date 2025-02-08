public class Lc0004 {

    public static class Solution{
        public double findMedianSortedArrays(int[] nums1, int[] nums2){
            double median = 0;
            int[] combineArrays = new int[nums1.length + nums2.length];

            for (int i = 0, num1Point = 0, num2Point = 0; i < combineArrays.length; i++){
                if(num1Point >= nums1.length){
                    combineArrays[i] = nums2[num2Point];
                    num2Point++;
                }
                else if(num2Point >= nums2.length){
                    combineArrays[i] = nums1[num1Point];
                    num1Point++;
                }
                else if(nums1[num1Point] > nums2[num2Point]){
                    combineArrays[i] = nums2[num2Point];
                    num2Point++;
                }
                else{
                    combineArrays[i] = nums1[num1Point];
                    num1Point++;
                }
            }

            if(combineArrays.length % 2 == 1){
                median = combineArrays[combineArrays.length / 2];
            }
            else{
                median = (double) (combineArrays[combineArrays.length / 2] + combineArrays[combineArrays.length / 2 - 1]) / 2;
            }

            return median;
        }
    }

    public static void main(String[] args) {

        // Example 1:
        // Input: nums1 = [1,3], nums2 = [2]
        // Output: 2.00000
        // Explanation: merged array = [1,2,3] and median is 2.

        // Example 2:
        // Input: nums1 = [1,2], nums2 = [3,4]
        // Output: 2.50000
        // Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

        Solution sol = new Solution();

        int[] nums1 = {1,3};
        int[] nums2 = {2};

        int[] nums3 = {1,2};
        int[] nums4 = {3,4};




        double median = sol.findMedianSortedArrays(nums3, nums4);

        System.out.println("The median is " + median);
    }

}
