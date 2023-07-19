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

    @Test
    public void givenEmpty_returnsAllZeros() {
        ScoringSystem scoringSystem = new ScoringSystem();
        int[] allZeros = scoringSystem.calculateScore("");
        assertArrayEquals(new int[3], allZeros );
    }

    @Test
    public void givenA_returnsOneZeroZero() {
        ScoringSystem scoringSystem = new ScoringSystem();
        int[] onlyAScoreZeros = scoringSystem.calculateScore("A");
        assertArrayEquals(new int[] {1, 0, 0}, onlyAScoreZeros );
    }

    @Test
    public void givenB_returnsZeroOneZero() {
        ScoringSystem scoringSystem = new ScoringSystem();
        int[] onlyBScoreZeros = scoringSystem.calculateScore("B");
        assertArrayEquals(new int[] {0, 1, 0}, onlyBScoreZeros );
    }

    @Test
    public void givenC_returnsZeroZeroOne() {
        ScoringSystem scoringSystem = new ScoringSystem();
        int[] onlyCScoreZeros = scoringSystem.calculateScore("C");
        assertArrayEquals(new int[] {0, 0, 1}, onlyCScoreZeros );
    }
}
