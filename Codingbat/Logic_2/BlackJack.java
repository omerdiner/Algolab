package Logic_2;

public class BlackJack {
    public int blackjack(int a, int b) {
        if (a > 21) {
            return b < 22 ? b : 0;
        }
        if (b > 21) {
            return a < 22 ? a : 0;
        }
        return Math.max(a, b);

    }
}
