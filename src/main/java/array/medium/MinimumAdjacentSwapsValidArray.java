package array.medium;

/**
 * #2340
 * <a href="https://leetcode.com/problems/minimum-adjacent-swaps-to-make-a-valid-array/description/">...</a>
 * My Solution: <a href="https://leetcode.com/problems/minimum-adjacent-swaps-to-make-a-valid-array/solutions/5901312/java-beats-100-time-complexity-o-n-space-complexity-o-1-with-explanation/">...</a>
 */
public class MinimumAdjacentSwapsValidArray {
    public int solve(int[] nums) {
        int indexMin = 0, indexMax = 0;
        int min = nums[0], max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                indexMin = i;
            }
            if (nums[i] >= max) {
                max = nums[i];
                indexMax = i;
            }
        }
        boolean isOverlap = indexMax < indexMin;
        int swapsForMin = indexMin;
        int swapsForMax = nums.length - indexMax - 1;
        return isOverlap ? swapsForMin + swapsForMax - 1 : swapsForMin + swapsForMax;
    }
}
