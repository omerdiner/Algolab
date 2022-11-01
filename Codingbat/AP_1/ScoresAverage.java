package AP_1;

public class ScoresAverage {
    public int scoresAverage(int[] scores) {
        int length = scores.length;

        int firstHalf = average(scores, 0, length / 2);
        int secondHalf = average(scores, length / 2, length);

        return Math.max(firstHalf, secondHalf);
    }

    int average(int[] scores, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += scores[i];
        }
        return sum / (end - start);
    }
}
