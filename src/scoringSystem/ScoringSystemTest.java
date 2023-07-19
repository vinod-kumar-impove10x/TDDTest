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
        int[] onlyAScore = scoringSystem.calculateScore("A");
        assertArrayEquals(new int[] {1, 0, 0}, onlyAScore );
    }

    @Test
    public void givenB_returnsZeroOneZero() {
        ScoringSystem scoringSystem = new ScoringSystem();
        int[] onlyBScore = scoringSystem.calculateScore("B");
        assertArrayEquals(new int[] {0, 1, 0}, onlyBScore );
    }

    @Test
    public void givenC_returnsZeroZeroOne() {
        ScoringSystem scoringSystem = new ScoringSystem();
        int[] onlyCScore = scoringSystem.calculateScore("C");
        assertArrayEquals(new int[] {0, 0, 1}, onlyCScore );
    }

    @Test
    public void givenAB_returnsOneOneZero() {
        ScoringSystem scoringSystem = new ScoringSystem();
        int[] abScores = scoringSystem.calculateScore("AB");
        assertArrayEquals(new int[] {1, 1, 0}, abScores );
    }
}
