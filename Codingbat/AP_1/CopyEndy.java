package AP_1;

public class CopyEndy {
    public int[] copyEndy(int[] nums, int count) {
        int arr[] = new int[count];
        int arrIndex = 0;
        int i = 0;
        while (arrIndex < count) {
            if (isEndy(nums[i])) {
                arr[arrIndex] = nums[i];
                arrIndex++;
            }
            i++;
        }
        return arr;
    }

    public boolean isEndy(int n) {
        return (n <= 10 && n >= 0) || (n >= 90 && n <= 100);
    }
}
