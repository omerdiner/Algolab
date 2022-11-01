package Array_2;

import java.util.ArrayList;

public class Pre4 {
    public int[] pre4(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums) {
            if (i == 4) {
                break;
            }
            list.add(i);
        }
        int arr[] = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
