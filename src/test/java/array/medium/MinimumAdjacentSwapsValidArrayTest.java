package array.medium;

import junit.framework.TestCase;

public class MinimumAdjacentSwapsValidArrayTest extends TestCase {
    public void test() {
        MinimumAdjacentSwapsValidArray validArray = new MinimumAdjacentSwapsValidArray();

        int[] array1 = {3,4,5,5,3,1};
        int[] array2 = {9};
        assertEquals(6, validArray.solve(array1));
        assertEquals(0, validArray.solve(array2));

    }
}