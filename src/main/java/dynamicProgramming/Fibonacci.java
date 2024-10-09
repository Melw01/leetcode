package dynamicProgramming;

public class Fibonacci {
    /*
    1. figure out the meaning of dp array and the pointer (should it be a 1D array or 2D array)
        1D array where dp[i] = ith element of the Fibonacci sequence
    2. figure out the recursion equation
        dp[i] = dp[i-1] + dp[i-2]
    3. figure out what values to initiate for dp array
        dp[0] = 1
        dp[1] = 2
    4. figure out the traversal order of dp elements (front --> back or back --> front)
        front to back
    5. print out the dp array (for debugging)
     */

    public int fib(int n) {
        if (n < 2) return n;
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n-1];
    }


    public int fibConcise(int n) {
        if (n < 2) return n;

        int a = 0;
        int b = 1;
        int sum = 0;

        for (int i = 1; i < n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }

}
