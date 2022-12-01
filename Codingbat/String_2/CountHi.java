package String_2;

public class CountHi {
    public int countHi(String str) {
        int count = 0;
        int lastIndex = 0;
        while (lastIndex != -1) {

            lastIndex = str.indexOf("hi", lastIndex);

            if (lastIndex != -1) {
                count++;
                lastIndex += 2;
            }
        }
        return count;
    }
}
