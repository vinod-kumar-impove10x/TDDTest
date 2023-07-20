package nameinverter;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameInverterTest {
    @Test
    public void nothing() {

    }

    //inputString = "", output = ""
    @Test
    public void givenEmpty_returnEmpty() {
        NameInverter nameInverter = new NameInverter();
        String invertedName = nameInverter.invertName("");
        assertEquals("", invertedName);
    }

    //input = "name", output = "name"
    @Test
    public void givenSingleWord_returnSingleWord() {
        NameInverter nameInverter = new NameInverter();
        String invertedName = nameInverter.invertName("name");
        assertEquals("name", invertedName);
    }

    //input = "name   ", output = "name"
    @Test
    public void givenSingleWordWithTrailingSpaces_returnSingleWord() {
        NameInverter nameInverter = new NameInverter();
        String invertedName = nameInverter.invertName("name   ");
        assertEquals("name", invertedName);
    }

    //input = "   name", output = "name"
    @Test
    public void givenSingleWordWithBeginningSpaces_returnSingleWord() {
        NameInverter nameInverter = new NameInverter();
        String invertedName = nameInverter.invertName("   name");
        assertEquals("name", invertedName);
    }

    //input = "first last", output = "last first"
    @Test
    public void givenFirstLast_returnLastFirst() {
        NameInverter nameInverter = new NameInverter();
        String invertedName = nameInverter.invertName("first last");
        assertEquals("last, first", invertedName);
    }

   //input = Honorifics(Mrs,Mr,Miss) "Mrs. first last", output = ignoreHonorifics "last, first"
    @Test
    public void givenMrsFirstLast_returnLastFirst() {
        NameInverter nameInverter = new NameInverter();
        String invertedName = nameInverter.invertName("Mrs. first last");
        assertEquals("last, first", invertedName);
    }

    @Test
    public void givenMrFirstLast_returnLastFirst() {
        NameInverter nameInverter = new NameInverter();
        String invertedName = nameInverter.invertName("Mr. first last");
        assertEquals("last, first", invertedName);
    }

    //input = givenPostNominals "first last MSc.", output = stayAtEnd "first last MSc."
    @Test
    public void givenFirstLastMSc_returnFirstLastMSc() {
        NameInverter nameInverter = new NameInverter();
        String invertedName = nameInverter.invertName("first last MSc.");
        assertEquals("last, first MSc.", invertedName);
    }
}
