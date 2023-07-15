package scoringSystem;

import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class Scoring {
    @BeforeEach
    public void setup() {
    }
    @Test
    public void nothing(){
    }
    @Test
    public void givenNull_ReturnsAllZero() {
        Score score = new Score();
        int[] allZeros = score.calculateScores(null);
        assertArrayEquals(new int[3], allZeros);
    }
    @Test
    public void givenEmpty_ReturnsAllZero() {
        Score score = new Score();
        int[] allZeros = score.calculateScores("");
        assertArrayEquals(new int[3], allZeros);
    }

    @Test
    public void givenA_ReturnsOneZeroZero() {
        Score score = new Score();
        int[] onlyAScores = score.calculateScores("A");
        assertArrayEquals(new int[]{1, 0, 0}, onlyAScores);
    }
    @Test
    public void givenB_ReturnsZeroOneZero() {
        Score score = new Score();
        int[] onlyBScores = score.calculateScores("B");
        assertArrayEquals(new int[]{0, 1, 0}, onlyBScores);
    }

    @Test
    public void givenC_ReturnsZeroZeroOne() {
        Score score = new Score();
        int[] onlyCScore = score.calculateScores("C");
        assertArrayEquals(new int[]{0, 0, 1}, onlyCScore);
    }

    @Test
    public void givenAB_ReturnsOneOneZero() {
        Score score = new Score();
        int[] abScore = score.calculateScores("AB");
        assertArrayEquals(new int[]{1, 1, 0}, abScore);
    }
    @Test
    public void givenABC_ReturnsAllOnes() {
        Score score = new Score();
        int[] abcScore = score.calculateScores("ABC");
        assertArrayEquals(new int[]{1, 1, 1}, abcScore);
    }

    @Test
    public void givenAABC_ReturnsTwoOneOne() {
        Score score = new Score();
        int[] aabcScore = score.calculateScores("AABC");
        assertArrayEquals(new int[]{2, 1, 1}, aabcScore);
    }

    @Test
    public void givenABBC_ReturnsOneTwoOne() {
        Score score = new Score();
        int[] abbc = score.calculateScores("ABBC");
        assertArrayEquals(new int[]{1, 2, 1}, abbc);
    }

    @Test
    public void givenABCC_ReturnsOneOneTwo() {
        Score score = new Score();
        int[] abcc = score.calculateScores("ABCC");
        assertArrayEquals(new int[]{1, 1, 2}, abcc);
    }

    @Test
    public void givenABBACCCCAC_ReturnsThreeTwoFive() {
        Score score = new Score();
        int[] abbbaccccac = score.calculateScores("ABBACCCCAC");
        assertArrayEquals(new int[]{3, 2, 5}, abbbaccccac);
    }
}
