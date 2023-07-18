package the3Programmers;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class The3ProgrammersTest {
    @Test
    public void nothing() {

    }

    @Test
    public void givenTenFiveFour_returnsSix() {
        The3Programmers the3Programmers = new The3Programmers();
        int difference = the3Programmers.difBtwMaxMinOf3Progrs(10, 5, 4);
        assertEquals(6,difference);
    }

    @Test
    public void givenFiftySixtyThirty_returnsThirty() {
        The3Programmers the3Programmers = new The3Programmers();
        int difference = the3Programmers.difBtwMaxMinOf3Progrs(50, 60, 30);
        assertEquals(30,difference);
    }

    @Test
    public void givenOneFiveNine_returnsEight() {
        The3Programmers the3Programmers = new The3Programmers();
        int difference = the3Programmers.difBtwMaxMinOf3Progrs(1, 5, 9);
        assertEquals(8,difference);
    }

    @Test
    public void given37_23_89_returns_66() {
        The3Programmers the3Programmers = new The3Programmers();
        int difference = the3Programmers.difBtwMaxMinOf3Progrs(37, 23, 89);
        assertEquals(66,difference);
    }
}
