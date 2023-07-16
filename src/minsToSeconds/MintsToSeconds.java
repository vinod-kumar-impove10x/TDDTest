package minsToSeconds;

public class MintsToSeconds {
    public int convertMinToSec(int min) {
        if (min <= 0){
            return 0;
        }else {
            int seconds = min * 60;
            return seconds;
        }
    }
}
