package scoringSystem;

public class ScoringSystem {
    public int[] calculateScore(String score) {
        if (score != null && score.equals("A")) {
            return new int[] {1, 0, 0};
        } else if (score != null && score.equals("B")) {
            return new int[] {1, 0, 0};
        }
        return new int[3];
    }
}
