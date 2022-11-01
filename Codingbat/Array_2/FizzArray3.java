package Array_2;

public class FizzArray3 {
    public int[] fizzArray3(int start, int end) {
        int arr[] = new int[end - start];

        int index = 0;
        for (int i = start; i < end; i++) {
            arr[index] = i;
            index++;
        }
        return arr;
    }
}
