package com.improve10x.tdd.fibonaccitest;

import com.improve10x.tdd.fibonacci.Fibonacci;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FibonacciTest {
    @Test
    public void nothing() {

    }

    @Test
    public void givenMinasFifteen_returnsMinasOne() {
        Fibonacci fibonacci = new Fibonacci();
        int negativeFibonacci = fibonacci.findNthNumber(-15);
        assertEquals(-1,negativeFibonacci);
    }

    @Test
    public void givenZero_returnsNegativeNumber() {
        Fibonacci fibonacci = new Fibonacci();
        int zeroFibonacci = fibonacci.findNthNumber(0);
        assertEquals(-1,zeroFibonacci);
    }

    @Test
    public void givenOne_returnsZero() {
        Fibonacci fibonacci = new Fibonacci();
        int firstFibonacci = fibonacci.findNthNumber(1);
        assertEquals(0,firstFibonacci);
    }

    @Test
    public void givenTwo_returnsOne() {
        Fibonacci fibonacci = new Fibonacci();
        int secondFibonacci = fibonacci.findNthNumber(2);
        assertEquals(1,secondFibonacci);
    }

    @Test
    public void givenThree_returnsOne() {
        Fibonacci fibonacci = new Fibonacci();
        int thirdFibonacci = fibonacci.findNthNumber(3);
        assertEquals(1,thirdFibonacci);
    }

    @Test
    public void givenFour_returnsTwo() {
        Fibonacci fibonacci = new Fibonacci();
        int fourthFibonacci = fibonacci.findNthNumber(4);
        assertEquals(2,fourthFibonacci);
    }

    @Test
    public void givenFive_returnsThree() {
        Fibonacci fibonacci = new Fibonacci();
        int fifthFibonacci = fibonacci.findNthNumber(5);
        assertEquals(3,fifthFibonacci);
    }
}
