package Array_3;

public class CountClumps {
    public int countClumps(int[] nums) {
        int count = 0;
        int i = 0, j, adjacent;
        while (i < nums.length) {
            j = i + 1;
            adjacent = 0;
            while (j < nums.length && nums[j] == nums[i]) {
                adjacent++;
                j++;
            }
            if (adjacent > 0) {
                count++;
                i += (adjacent - 1);
            }
            i++;
        }
        return count;
    }

}
