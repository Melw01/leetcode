package dynamicProgramming;

public class ClimbingStairs {
    /*
    1. figure out the meaning of dp array and the pointer (should it be a 1D array or 2D array)
        dp[i] = number of ways to get to the ith stair
    2. figure out the recursion equation
        dp[i] = dp[i-1] + dp[i-2]
    3. figure out what values to initiate for dp array
        dp[0] = 0 no meaning
        dp[1] = 1
        dp[2] = 2
    4. figure out the traversal order of dp elements (front --> back or back --> front)
        from front to back
    5. print out the dp array (for debugging)
     */
    public int climb(int n) {
        if (n < 2) return n;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
