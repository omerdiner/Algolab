package String_3;

public class EqualIsNot {
    public boolean equalIsNot(String str) {

        int is = countAppearences(str, "is");
        int not = countAppearences(str, "not");

        return is == not;
    }

    public int countAppearences(String str, String findStr) {

        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1) {

            lastIndex = str.indexOf(findStr, lastIndex);

            if (lastIndex != -1) {
                count++;
                lastIndex += findStr.length();
            }
        }
        return count;
    }
}
