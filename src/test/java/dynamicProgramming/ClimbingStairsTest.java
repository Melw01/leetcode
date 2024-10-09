package dynamicProgramming;

import dynamicProgramming.easy.ClimbingStairs;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClimbingStairsTest {

    @Test
    public void test() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        assertEquals(1, climbingStairs.solve(1));
        assertEquals(2, climbingStairs.solve(2));
        assertEquals(3, climbingStairs.solve(3));
        assertEquals(5, climbingStairs.solve(4));
        assertEquals(8, climbingStairs.solve(5));
    }
}
