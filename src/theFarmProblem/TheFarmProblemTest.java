package theFarmProblem;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TheFarmProblemTest {
    @Test
    public void nothing() {

    }

    @Test
    public void givenNumberChic2Cows3Pigs5_returnsTotalLegs() {
      TheFarmProblem theFarmProblem = new TheFarmProblem();
      int TotalLegs = theFarmProblem.findNumLegs(2, 3, 5);
        assertEquals(36,TotalLegs);
    }

    @Test
    public void givenNumberChic1Cows2Pigs3_returnsTotalLegs() {
        TheFarmProblem theFarmProblem = new TheFarmProblem();
        int TotalLegs = theFarmProblem.findNumLegs(1, 2, 3);
        assertEquals(22,TotalLegs);
    }

    @Test
    public void givenNumberChic5Cows2Pigs8_returnsTotalLegs() {
        TheFarmProblem theFarmProblem = new TheFarmProblem();
        int TotalLegs = theFarmProblem.findNumLegs(5, 2, 8);
        assertEquals(50,TotalLegs);
    }

    @Test
    public void givenNumberChic23Cows46Pigs35_returnsTotalLegs() {
        TheFarmProblem theFarmProblem = new TheFarmProblem();
        int TotalLegs = theFarmProblem.findNumLegs(23, 46, 35);
        assertEquals(370,TotalLegs);
    }

    @Test
    public void givenNumberChic12Cows15Pigs19_returnsTotalLegs() {
        TheFarmProblem theFarmProblem = new TheFarmProblem();
        int TotalLegs = theFarmProblem.findNumLegs(12, 15, 19);
        assertEquals(160,TotalLegs);
    }
}
