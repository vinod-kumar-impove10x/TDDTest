package scoringSystem;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class ScoringSystemTest {
    @Test
    public void nothing() {

    }

    @Test
    public void givenNull_returnsAllZeros() {
        ScoringSystem scoringSystem = new ScoringSystem();
        int[] allZeros = scoringSystem.calculateScore(null);
        assertArrayEquals(new int[3], allZeros );
    }
}
