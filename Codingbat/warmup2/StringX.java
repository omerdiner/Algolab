package warmup2;

public class StringX {
    public String stringX(String str) {
        if (str.equals("x")) {
            return str;
        }
        String x = str.replaceAll("x", "");
        if (str.startsWith("x")) {
            x = "x" + x;
        }
        if (str.endsWith("x")) {
            x = x + "x";
        }
        return x;
    }
}
