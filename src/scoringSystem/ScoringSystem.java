package scoringSystem;

public class ScoringSystem {
    public int[] calculateScore(String score) {
        int[] scores = new int[3];
        if (score != null) {
            for (int i = 0; i< score.length(); i++) {
                char c = score.charAt(i);
                if (c == 'A') {
                    scores[0] = 1;
                } else if (c == 'B') {
                    scores[1] = 1;
                } else if (score.equals("C")) {
                    return new int[]{0, 0, 1};
                }
            }
        }
        return scores;
    }
}
