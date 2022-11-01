package warmup2;

public class StringBits {
    public String stringBits(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i = i + 2) {
            newString += str.charAt(i);
        }
        return newString;
    }
}
