package AP_1;

public class ScoreUp {
    public int scoreUp(String[] key, String[] answers) {
        int score = 0;

        for (int i = 0; i < key.length; i++) {
            if (answers[i] == key[i]) {
                score += 4;
            } else if (!answers[i].equals("?")) {
                score -= 1;
            }
        }
        return score;
    }

}
