package minsToSeconds;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MintsToSecondsTest {
    @Test
    public void nothing() {

    }

    @Test
    public void givenFiveMints_returnsThreeHundredSeconds(){
        MintsToSeconds mintsToSeconds = new MintsToSeconds();
        int seconds = mintsToSeconds.convertMinToSec(5);
        assertEquals(300,seconds);
    }

    @Test
    public void givenTenMints_returnsSixHundredSeconds(){
        MintsToSeconds mintsToSeconds = new MintsToSeconds();
        int seconds = mintsToSeconds.convertMinToSec(10);
        assertEquals(600,seconds);
    }

    @Test
    public void givenEightMints_returnsFourHundredEightySeconds(){
        MintsToSeconds mintsToSeconds = new MintsToSeconds();
        int seconds = mintsToSeconds.convertMinToSec(8);
        assertEquals(480,seconds);
    }

    @Test
    public void givenNegativeNumber_returnsZeroSeconds(){
        MintsToSeconds mintsToSeconds = new MintsToSeconds();
        int seconds = mintsToSeconds.convertMinToSec(-27);
        assertEquals(0,seconds);
    }
}
