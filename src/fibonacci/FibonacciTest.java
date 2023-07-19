package fibonacci;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FibonacciTest {
    @Test
    public void nothing() {

    }

    @Test
    public void givenMinasFifteen_returnsMinasOne() {
        Fibonacci fibonacci = new Fibonacci();
        int negativeFibonacci = fibonacci.findFibonacci(-15);
        assertEquals(-1,negativeFibonacci);
    }

    @Test
    public void givenZero_returnsNegativeNumber() {
        Fibonacci fibonacci = new Fibonacci();
        int zeroFibonacci = fibonacci.findFibonacci(0);
        assertEquals(-1,zeroFibonacci);
    }
}
