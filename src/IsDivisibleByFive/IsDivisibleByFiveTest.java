package IsDivisibleByFive;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class IsDivisibleByFiveTest {
    @Test
    public void nothing(){

    }

    @Test
    public void givenTen_returnsTrue(){
        IsDivisibleByFive isDivisibleByFive = new IsDivisibleByFive();
        boolean result = isDivisibleByFive.isFiveDivisible(10);
        assertEquals(true,result);

    }

    @Test
    public void givenThirty_returnsTrue(){
        IsDivisibleByFive isDivisibleByFive = new IsDivisibleByFive();
        boolean result = isDivisibleByFive.isFiveDivisible(30);
        assertEquals(true,result);
    }

    @Test
    public void givenTwenty_returnsTrue(){
        IsDivisibleByFive isDivisibleByFive = new IsDivisibleByFive();
        boolean result = isDivisibleByFive.isFiveDivisible(20);
        assertEquals(true,result);
    }

    @Test
    public void givenEight_returnsFalse(){
        IsDivisibleByFive isDivisibleByFive = new IsDivisibleByFive();
        boolean result = isDivisibleByFive.isFiveDivisible(8);
        assertEquals(false,result);
    }

    @Test
    public void givenSeven_returnsFalse(){
        IsDivisibleByFive isDivisibleByFive = new IsDivisibleByFive();
        boolean result = isDivisibleByFive.isFiveDivisible(7);
        assertEquals(false,result);

    }

}
