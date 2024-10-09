package dynamicProgramming;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClimbingStairsTest {

    @Test
    public void testClimbingStairs() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        assertEquals(1, climbingStairs.climb(1));
        assertEquals(2, climbingStairs.climb(2));
        assertEquals(3, climbingStairs.climb(3));
        assertEquals(5, climbingStairs.climb(4));
        assertEquals(8, climbingStairs.climb(5));
    }
}
