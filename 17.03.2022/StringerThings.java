import java.util.Scanner;

public class StringerThings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        String s = scan.next();

        System.out.print(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                System.out.print(s.charAt(i));
            }
        }


    }
}
