package dynamicProgramming;

import dynamicProgramming.medium.IntegerBreak;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerBreakTest {

    @Test
    public void test() {
        IntegerBreak integerBreak = new IntegerBreak();
        assertEquals(1, integerBreak.solve(2));


        assertEquals(9, integerBreak.solve(6));
        assertEquals(36, integerBreak.solve(10));
    }
}
