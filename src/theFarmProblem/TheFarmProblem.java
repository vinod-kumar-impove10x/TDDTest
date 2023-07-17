package theFarmProblem;

public class TheFarmProblem {
    public int findNumLegs(int chickens, int cows, int pigs) {
        int chickenLegs = chickens * 2;
        int cowLegs = cows * 4;
        int pigLegs = pigs * 4;
        int totalLegs = chickenLegs + cowLegs + pigLegs;
        return totalLegs;
    }
}
