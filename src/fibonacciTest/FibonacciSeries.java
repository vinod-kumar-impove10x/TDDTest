package fibonacciTest;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FibonacciSeries {
    @Test
    public void nothing(){
    }
    /*
    0 , 1, 1, 2, 3, 5, 8, 13, 21.....
    input 0 -> output 0;
    input 1 -> output 1;
    input 2 -> output 2;
    Any negative -19 -> -1;
     */
    @Test
    public void givenNegativeNumber_ReturnsNegativeOne(){
        Fibonacci fibonacci = new Fibonacci();
        int negativeNumber = fibonacci.findNthNumber(-5);
        assertEquals(-1,negativeNumber);

    }

    @Test
    public void giveZero_returnsNegativeOne(){
        Fibonacci fibonacci = new Fibonacci();
        int negativeNumber = fibonacci.findNthNumber(0);
        assertEquals(-1,negativeNumber);
    }

    @Test
    public void givenOne_ReturnsZero(){
        Fibonacci fibonacci = new Fibonacci();
        int firstNumber = fibonacci.findNthNumber(1);
        assertEquals(0,firstNumber);
    }
    @Test
    public void givenTwo_ReturnsOne(){
        Fibonacci fibonacci = new Fibonacci();
        int secondThNumber = fibonacci.findNthNumber(2);
        assertEquals(1,secondThNumber);
    }
    @Test
    public void givenThree_ReturnsOne(){
        Fibonacci fibonacci = new Fibonacci();
        int thirdNumber = fibonacci.findNthNumber(3);
        assertEquals(1,thirdNumber);
    }
    @Test
    public void givenFive_ReturnsThree(){
        Fibonacci fibonacci = new Fibonacci();
        int fifthNumber = fibonacci.findNthNumber(5);
        assertEquals(3,fifthNumber);
    }
}
