package String_3;

public class NotReplace {

    public String notReplace(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i > 0 && Character.isLetter(str.charAt(i - 1))
                    || i + 2 < str.length() && Character.isLetter(str.charAt(i + 2))) {
                result += str.charAt(i);
            } else if (str.substring(i).startsWith("is")) {
                result += "is not";
                i += 1;
            } else {
                result += str.charAt(i);
            }
        }
        return result;
    }

}
