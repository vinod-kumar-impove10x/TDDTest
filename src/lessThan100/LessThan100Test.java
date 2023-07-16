package lessThan100;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class LessThan100Test {

    @Test
    public void nothing() {

    }

    @Test
    public void givenThirtyFiveFortySix_returnsFalse(){
        IsLessThan100 isLessThan100 = new IsLessThan100();
        boolean result = isLessThan100.checkNum(35, 46);
        assertEquals(true,result);
    }

    @Test
    public void givenFiftyFifty_returnsFalse(){
        IsLessThan100 isLessThan100 = new IsLessThan100();
        boolean result = isLessThan100.checkNum(50, 50);
        assertEquals(false,result);
    }

    @Test
    public void givenHundredForty_returnsFalse(){
        IsLessThan100 isLessThan100 = new IsLessThan100();
        boolean result = isLessThan100.checkNum(100, 40);
        assertEquals(false,result);
    }
}
