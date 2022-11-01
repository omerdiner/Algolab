package Array_2;

public class Sum28 {
    public boolean sum28(int[] nums) {
        int twos_count = 0;
        for (int i : nums) {
            if (i == 2) {
                twos_count++;
            }
        }
        return twos_count == 4 ? true : false;
    }

}
