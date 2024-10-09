package dynamicProgramming;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniquePathsTest {

    @Test
    public void testUniquePaths() {
        UniquePaths uniquePaths = new UniquePaths();
        assertEquals(28, uniquePaths.solve(3, 7));
        assertEquals(3, uniquePaths.solve(3, 2));
    }
}
