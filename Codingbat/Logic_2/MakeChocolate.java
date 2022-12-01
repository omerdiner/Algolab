package Logic_2;

public class MakeChocolate {
    public int makeChocolate(int small, int big, int goal) {
        if (big * 5 + small < goal) {
            return -1;
        }

        int fives = (goal / 5) > big ? big : goal / 5;
        int ones = goal - (fives * 5);

        return small >= ones ? ones : -1;

    }
}
