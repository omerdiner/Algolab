import java.util.Scanner;

public class DumbbellsOfEkrem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int Q = scan.nextInt();
        int dumbells[] = new int[N];
        int queries[][] = new int[Q][2];
        for (int i = 0; i < N; i++) {
            dumbells[i] = scan.nextInt();
        }
        for (int i = 0; i < Q; i++) {
            queries[i][0] = scan.nextInt();
            queries[i][1] = scan.nextInt();
        }

        for (int i = 0; i < Q; i++) {
            int weight = 0;
            for (int j = queries[i][0] - 1; j < queries[i][1]; j++) {
                weight += dumbells[j];
            }
            System.out.println(weight);
        }

    }
}
