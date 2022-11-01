package Array_2;

import java.util.ArrayList;
import java.util.List;

public class TwoTwo {
    public boolean twoTwo(int[] nums) {

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                list.add(i);
            }
        }

        if (list.size() == 1) {
            return false;
        }

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) - list.get(i) != 1) {
                return false;
            }
        }

        return true;
    }

}
