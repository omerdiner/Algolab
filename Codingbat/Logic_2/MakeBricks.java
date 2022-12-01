package Logic_2;

public class MakeBricks {
    public boolean makeBricks(int small, int big, int goal) {

        if (small >= goal) {
            return true;
        } else {
            if (goal % 5 > small) {
                return false;
            } else {
                return big * 5 + small >= (goal);
            }
        }
    }
}
