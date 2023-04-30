import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i : nums) {
            set.add(i);
        }
        int longest = 0;
        for (int i : nums) {
            if (!set.contains(i + 1)) {
                int tmp = 0;
                int smaller = i - 1;
                while (set.contains(smaller)) {
                    tmp++;
                    smaller--;
                }

                if (tmp > longest) {
                    longest = tmp;
                }
            }
        }

        return longest + 1;

    }
}
