package AP_1;

public class SumHeights2 {
    public int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {

            sum += (Math.abs(heights[i + 1] - heights[i]));

            if (heights[i + 1] > heights[i]) {
                sum += (heights[i + 1] - heights[i]);
            }
        }
        return sum;
    }
}
