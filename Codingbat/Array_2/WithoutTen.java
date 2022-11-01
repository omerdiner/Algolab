package Array_2;

import java.util.ArrayList;

public class WithoutTen {
    public int[] withoutTen(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int ten = 0;
        int j = 0;
        for (int i : nums) {
            if (i == 10) {
                ten++;
            } else {
                list.add(i);
            }
        }
        for (int i : list) {
            nums[j] = i;
            j++;
        }
        while (ten > 0) {
            nums[j] = 0;
            ten--;
            j++;
        }
        return nums;

    }

}
