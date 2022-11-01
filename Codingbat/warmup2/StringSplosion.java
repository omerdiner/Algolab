package warmup2;

public class StringSplosion {
    public String stringSplosion(String str) {

        int length = 1;
        String splosion = "";
        while (length <= str.length()) {
            splosion += str.substring(0, length);
            length++;
        }
        return splosion;
    }
}
