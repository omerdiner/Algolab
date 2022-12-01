package String_2;

public class xyzThere {
    public boolean xyzThere(String str) {
        if (str.startsWith("xyz")) {
            return true;
        }

        for (int i = 1; i < str.length() - 2; i++) {
            if (str.charAt(i - 1) != '.' && str.substring(i, i + 3).equals("xyz"))
                return true;
        }

        return false;

    }

}
