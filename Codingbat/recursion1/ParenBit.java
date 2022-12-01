package recursion1;

public class ParenBit {
    public String parenBit(String str) {

        if (str == "")
            return str;

        if (str.charAt(0) == '(') {
            if (str.charAt(str.length() - 1) == ')') {
                return str;
            } else {
                // finding ')'
                return parenBit(str.substring(0, str.length() - 1));
            }
        }

        // finding '('
        return parenBit(str.substring(1));

    }
}
