package Array_2;

public class MatchUp {
    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        int differ;

        for (int i = 0; i < nums1.length; i++) {
            differ = Math.abs(nums1[i] - nums2[i]);
            if (differ > 0 && differ < 3) {
                count++;
            }
        }
        return count;
    }

}
