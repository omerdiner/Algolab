package String_2;

public class GetSandwich {
    public String getSandwich(String str) {
        int first = -1;
        int last = -1;

        for (int i = 0; i < str.length() - 5; i++) {
            if (str.substring(i, i + 5).equals("bread")) {
                first = i;
                break;
            }
        }
        for (int i = str.length() - 5; i > -1; i--) {
            if (str.substring(i, i + 5).equals("bread")) {
                last = i;
                break;
            }
        }

        if (first == last)
            return "";

        return str.substring(first + 5, last);
    }
}
