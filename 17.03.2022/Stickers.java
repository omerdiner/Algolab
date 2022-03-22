import java.util.Scanner;

public class Stickers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();

        n = productOfNum(n);

        while (n > 9) {
            n = productOfNum(n);
        }
        System.out.println(n);

    }

    public static long productOfNum(long num) {
        long result = 1;

        while (num > 0) {
            if (num % 10 != 0) {
                result *= num % 10;
            }
            num /= 10;
        }

        return result;
    }
}
