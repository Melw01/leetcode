package array.medium;

import junit.framework.TestCase;

public class MinDiffBetweenLargestAndSmallestThreeMovesTest extends TestCase {

    public void test() {
        MinDiffBetweenLargestAndSmallestThreeMoves minDiff = new MinDiffBetweenLargestAndSmallestThreeMoves();

        int[] array1 = {5, 3, 2, 4};
        int[] array2 = {1, 5, 0, 10, 14};
        int[] array3 = {3, 100, 20};

        assertEquals(0, minDiff.solve(array1));
        assertEquals(1, minDiff.solve(array2));
        assertEquals(0, minDiff.solve(array3));
    }
}
