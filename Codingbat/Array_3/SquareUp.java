package Array_3;

public class SquareUp {
    public int[] squareUp(int n) {
        int arr[] = new int[n * n];
        int lap = n;
        int index = n * n - 1;
        int j;
        for (int i = 0; i < n; i++) {
            for (j = 0; j < lap; j++) {
                arr[index] = j + 1;
                index--;
            }

            for (j = 0; j < n - lap; j++) {
                arr[index] = 0;
                index--;
            }
            lap--;
        }

        return arr;
    }

}
