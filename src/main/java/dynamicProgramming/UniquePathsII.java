package dynamicProgramming;

public class UniquePathsII {
    /*
    1. figure out the meaning of dp array and the pointer (should it be a 1D array or 2D array)
        2D array (dp[i][j]) with i = row# and j = col#. dp[i][j] = # unique paths to (i, j)
    2. figure out the recursion equation
        dp[i][j] = dp[i-1][j] + dp[i][j-1] ONLY IF dp[i][j] is not an obstacle (dp[i][j] = 0)
    3. figure out what values to initiate for dp array
        we have to initiate the TOP row and the FIRST column since we're starting from the top left corner
        TOP ROW: dp[0][j] cells in top row will all have 1 unique path UNTIL we meet an obstacle, then the remaining cells only have 0 unique paths
                for (int i=0; i<m && dp[i][0] = 0; i++) { dp[0][j] = 1 }
        FIRST COL: dp[i][0] cells in first col will all have 1 unique path UNTIL we meet an obstacle, then the remaining cells only have 0 unique paths
                for (int j=0; j<n && dp[0][j]; j++) { dp[i][0] = 1 }
    4. figure out the traversal order of dp elements (front --> back or back --> front)
        from left to right, top to bottom
    5. print out the dp array (for debugging)
     */
    public int solve(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];

        // if an obstacle is at the STARTING POINT or GOAL, return 0
        if (obstacleGrid[m - 1][n - 1] == 1 || obstacleGrid[0][0] == 1) return 0;

        //initialization
        for (int i = 0; i < m && obstacleGrid[i][0] == 0; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n && obstacleGrid[0][j] == 0; j++) {
            dp[0][j] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
