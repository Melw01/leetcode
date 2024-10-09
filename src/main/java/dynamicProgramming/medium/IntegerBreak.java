package dynamicProgramming.medium;

public class IntegerBreak {
    /*
    1. figure out the meaning of dp array and the pointer (should it be a 1D array or 2D array)
        i = input number, dp[i] = max product of numbers that adds up to i
    2. figure out the recursion equation
        How to find the maximum product of dp[i]?
        By traversing j from 1, we get dp[i] through two channels.
            - directly multiply j * (i - j).
            - j * dp[i - j], which is equivalent to splitting (i - j).
        We don't need to split j (dp[j]) because dj[i-j] will cover all the cases

        When traversing j from 1, compare these two:
            j * (i - j)     simply splits the integer into two numbers and multiplies them, while
            j * dp[i - j]   splits it into two or more numbers and multiplies them.
        to take the max.

        We also need to compare dp[i] when taking the max value because when each time dp[i] is calculated, only the largest one is taken.

        So the recursive formula is: dp[i] = max({dp[i], j * (i - j), j * dp[i - j]});

        ** Note: to get the max product, try to break i into similar numbers (e.g. to split 10, 5 * 5 yields the highest)

    3. figure out what values to initiate for dp array
        dp[0] = 0 (no meaning since you cannot break 1)
        dp[1] = 0 (no meaning since you cannot break 1)
        dp[2] = 1
    4. figure out the traversal order of dp elements (front --> back or back --> front)
        front -> back
    5. print out the dp array (for debugging)
     */

    /**
     * Time complexity: O(n^2)
     * Space complexity: O(n)
     */
    public int solve(int n) {
        int[] dp = new int[n+1];
        dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            for (int j = 1; j <= i-j; j++) {
                dp[i] = Math.max(dp[i], Math.max(j*(i-j), j*dp[i-j]));
            }
        }
        return dp[n];
    }
}
