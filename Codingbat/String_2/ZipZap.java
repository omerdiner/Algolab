package String_2;

public class ZipZap {
    public String zipZap(String str) {
        if (str.length() < 3) {
            return str;
        }
        String s = "";

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                s += "zp";
                i += 2;
            } else {
                s += "" + str.charAt(i);
            }
        }

        if (!s.substring(s.length() - 2, s.length()).equals("zp")) {
            s += str.substring(str.length() - 2);
        }
        return s;
    }
}
