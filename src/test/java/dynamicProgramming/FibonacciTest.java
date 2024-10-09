package dynamicProgramming;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void testFibonacci() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(0, fibonacci.fib(0)); // F(0) = 0
        assertEquals(1, fibonacci.fib(1)); // F(1) = 1
        assertEquals(1, fibonacci.fib(2)); // F(2) = 1
        assertEquals(2, fibonacci.fib(3)); // F(3) = 2
        assertEquals(3, fibonacci.fib(4)); // F(4) = 3
        assertEquals(5, fibonacci.fib(5)); // F(5) = 5
    }

    @Test
    public void testFibonacciConcise() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(0, fibonacci.fibConcise(0)); // F(0) = 0
        assertEquals(1, fibonacci.fibConcise(1)); // F(1) = 1
        assertEquals(1, fibonacci.fibConcise(2)); // F(2) = 1
        assertEquals(2, fibonacci.fibConcise(3)); // F(3) = 2
        assertEquals(3, fibonacci.fibConcise(4)); // F(4) = 3
        assertEquals(5, fibonacci.fibConcise(5)); // F(5) = 5
    }
}
