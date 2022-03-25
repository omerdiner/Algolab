
import java.util.Scanner;


class AnEasyMagicTrick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int arr[] = new int[1024];
        for (int i = 0; i < 1024; i++) {
            arr[i] = scan.nextInt();
        }

        int start = 0;
        int end = 1023;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            System.out.println((mid + 1) + " " + arr[mid]);
            if (arr[mid] == N) {
                return;
            } else if (arr[mid] > N) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }
}
