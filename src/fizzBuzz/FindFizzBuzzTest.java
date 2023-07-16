package fizzBuzz;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FindFizzBuzzTest {

    @Test
    public void nothing() {

    }

    @Test
    public void givenThree_returnsFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.findFizzBuzz(3);
        assertEquals("Fizz",result);
    }

    @Test
    public void givenFive_returnsBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.findFizzBuzz(5);
        assertEquals("Buzz",result);
    }

    @Test
    public void givenFifteen_returnsFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.findFizzBuzz(15);
        assertEquals("FizzBuzz",result);
    }

    @Test
    public void givenThirty_returnsFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.findFizzBuzz(30);
        assertEquals("FizzBuzz",result);
    }

    @Test
    public void givenFour_returnsEmptyString() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.findFizzBuzz(4);
        assertEquals("",result);
    }
}
