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
}
