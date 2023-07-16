package equalityOf3Values;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class EqualityOf3ValuesTest {
    @Test
    public void nothing() {

    }

    @Test
    public void givenThreeFourThree_returnsTwo() {
        EqualityOf3Values equalityOf3Values = new EqualityOf3Values();
        int result = equalityOf3Values.findEquality(3, 4, 3);
        assertEquals(2,result);
    }

    @Test
    public void givenOneOneOne_returnsThree() {
        EqualityOf3Values equalityOf3Values = new EqualityOf3Values();
        int result = equalityOf3Values.findEquality(1, 1, 1);
        assertEquals(3,result);
    }

    @Test
    public void givenThreeFourOne_returnsZero() {
        EqualityOf3Values equalityOf3Values = new EqualityOf3Values();
        int result = equalityOf3Values.findEquality(3, 4, 1);
        assertEquals(0,result);
    }

    @Test
    public void givenNegativeThreeFourOne_returnsZero() {
        EqualityOf3Values equalityOf3Values = new EqualityOf3Values();
        int result = equalityOf3Values.findEquality(-3, -4, -1);
        assertEquals(0,result);
    }

    @Test
    public void givenNegativeOneOneOne_returnsThree() {
        EqualityOf3Values equalityOf3Values = new EqualityOf3Values();
        int result = equalityOf3Values.findEquality(-1, -1, -1);
        assertEquals(3,result);
    }
}
