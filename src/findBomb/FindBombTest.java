package findBomb;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FindBombTest {
    @Test
    public void nothing(){

    }

    @Test
    public void givenLowerCaseBomb_returnsDuck(){
        FindBomb findBomb = new FindBomb();
        String result = findBomb.searchTheBomb("There is a bomb.");
        assertEquals("Duck!",result);
    }
}
