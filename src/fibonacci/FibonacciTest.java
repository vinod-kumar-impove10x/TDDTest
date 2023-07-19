package fibonacci;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FibonacciTest {
    @Test
    public void nothing() {

    }

    @Test
    public void givenNegativeNumber_returnsMinasOne() {
        Fibonacci fibonacci = new Fibonacci();
        int negativeFibonacci = fibonacci.findFibonacci(-15);
        assertEquals(-1,negativeFibonacci);
    }
}
