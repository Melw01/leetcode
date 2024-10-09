package dynamicProgramming.easy;

public class UniquePaths {
    /*
    1. figure out the meaning of dp array and the pointer (should it be a 1D array or 2D array)
        2D array (dp[i][j]) with i = row# and j = col#. dp[i][j] = # unique paths to (i, j)
    2. figure out the recursion equation
        dp[i][j] = dp[i-1][j] + dp[i][j-1]
    3. figure out what values to initiate for dp array
        we have to initiate the TOP row and the FIRST column since we're starting from the top left corner
        TOP ROW: dp[0][j] cells in top row will all have 1 unique path
                for (int i=0; i<m; i++) { dp[0][j] = 1 }
        FIRST COL: dp[i][0] cells in first col will all have 1 unique path
                for (int j=0; j<n; j++) { dp[i][0] = 1 }
    4. figure out the traversal order of dp elements (front --> back or back --> front)
        from left to right, top to bottom
    5. print out the dp array (for debugging)
     */

    public int solve(int m, int n) {
        int[][] dp = new int[m][n];

        // initiation
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

        // traversal order: left -> right, top -> bottom
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                // recursion
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
