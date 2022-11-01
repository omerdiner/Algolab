package Array_2;

public class Only14 {
    public boolean only14(int[] nums) {
        for (int i : nums) {
            if (i != 1 && i != 4) {
                return false;
            }
        }
        return true;
    }
}
