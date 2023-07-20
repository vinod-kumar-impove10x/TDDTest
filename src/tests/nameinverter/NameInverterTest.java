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
}
