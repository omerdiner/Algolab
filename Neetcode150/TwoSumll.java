public class TwoSumll {
    public int[] twoSum(int[] numbers, int target) {
        int ans[] = new int[2];
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            if (numbers[start] + numbers[end] < target) {
                start++;
            } else if (numbers[start] + numbers[end] > target) {
                end--;
            } else {
                ans[0] = start + 1;
                ans[1] = end + 1;
                return ans;
            }
        }
        return ans;
    }
}
