package twoMakesTen;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TwoMakesTenTest {

    @Test
    public void nothing() {

    }

    @Test
    public void givenFiveFive_returnsTrue() {
        IsTwoMakesTen isTwoMakesTen = new IsTwoMakesTen();
        boolean result = isTwoMakesTen.sumOfNum(5,5);
        assertEquals(true,result);
    }

    @Test
    public void givenFiveTwo_returnsFalse() {
        IsTwoMakesTen isTwoMakesTen = new IsTwoMakesTen();
        boolean result = isTwoMakesTen.sumOfNum(5,2);
        assertEquals(false,result);
    }

    @Test
    public void givenFiveTen_returnsTrue() {
        IsTwoMakesTen isTwoMakesTen = new IsTwoMakesTen();
        boolean result = isTwoMakesTen.sumOfNum(5,10);
        assertEquals(true,result);
    }

    @Test
    public void givenTenTwo_returnsTrue() {
        IsTwoMakesTen isTwoMakesTen = new IsTwoMakesTen();
        boolean result = isTwoMakesTen.sumOfNum(10,2);
        assertEquals(true,result);
    }

    @Test
    public void givenFourThree_returnsFalse() {
        IsTwoMakesTen isTwoMakesTen = new IsTwoMakesTen();
        boolean result = isTwoMakesTen.sumOfNum(4,3);
        assertEquals(false,result);
    }
}
