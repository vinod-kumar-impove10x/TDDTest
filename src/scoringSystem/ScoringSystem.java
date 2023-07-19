package scoringSystem;

public class ScoringSystem {
    public int[] calculateScore(String score) {
        if (score != null && score.equals("A")) {
            return new int[] {1, 0, 0};
        } else if (score != null && score.equals("B")) {
            return new int[] {0, 1, 0};
        } else if (score != null && score.equals("C")) {
            return new int[] {0, 0, 1};
        }
        return new int[3];
    }
}
