package nthEvenNumberTest;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class NthEvenNumberTest {

    @Test
    public void nothing() {

  }

   @Test
    public void givenTen_returnEighteen(){
        NthEvenNumber nthEvenNumber = new NthEvenNumber();
        int eighteen = nthEvenNumber.findNthEvenNumber(10);
        assertEquals(18,eighteen);
   }

    @Test
    public void givenZero_returnNegativeNumber(){
        NthEvenNumber nthEvenNumber = new NthEvenNumber();
        int negativeNumber = nthEvenNumber.findNthEvenNumber(0);
        assertEquals(-1,negativeNumber);
    }

    @Test
    public void givenNegativeNumber_returnNegativeNumber(){
        NthEvenNumber nthEvenNumber = new NthEvenNumber();
        int negativeNumber = nthEvenNumber.findNthEvenNumber(-10);
        assertEquals(-1,negativeNumber);
    }

    @Test
    public void givenTirtytwo_returnSixstytwo(){
        NthEvenNumber nthEvenNumber = new NthEvenNumber();
        int negativeNumber = nthEvenNumber.findNthEvenNumber(32);
        assertEquals(62,negativeNumber);
    }
}
