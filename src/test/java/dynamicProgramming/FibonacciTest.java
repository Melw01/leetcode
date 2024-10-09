package dynamicProgramming;

import static org.junit.Assert.assertEquals;

import dynamicProgramming.easy.Fibonacci;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void test() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(0, fibonacci.solve(0)); // F(0) = 0
        assertEquals(1, fibonacci.solve(1)); // F(1) = 1
        assertEquals(1, fibonacci.solve(2)); // F(2) = 1
        assertEquals(2, fibonacci.solve(3)); // F(3) = 2
        assertEquals(3, fibonacci.solve(4)); // F(4) = 3
        assertEquals(5, fibonacci.solve(5)); // F(5) = 5
    }

    @Test
    public void testConcise() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(0, fibonacci.solveConcise(0)); // F(0) = 0
        assertEquals(1, fibonacci.solveConcise(1)); // F(1) = 1
        assertEquals(1, fibonacci.solveConcise(2)); // F(2) = 1
        assertEquals(2, fibonacci.solveConcise(3)); // F(3) = 2
        assertEquals(3, fibonacci.solveConcise(4)); // F(4) = 3
        assertEquals(5, fibonacci.solveConcise(5)); // F(5) = 5
    }
}
