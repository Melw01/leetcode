package dynamicProgramming;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniquePathsIITest {

    @Test
    public void testUniquePathsII() {
        UniquePathsII uniquePathsII = new UniquePathsII();
        int[][] array1 = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };

        assertEquals(2, uniquePathsII.solve(array1));

        int[][] array2 = {
                {0, 1},
                {0, 0}
        };
        assertEquals(1, uniquePathsII.solve(array2));
    }
}
