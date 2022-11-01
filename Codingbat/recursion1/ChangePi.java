package recursion1;

public class ChangePi {
    public String changePi(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.length() >= 2 && str.substring(str.length() - 2, str.length()).equals("pi")) {
            return changePi(str.substring(0, str.length() - 2)) + "3.14";
        } else {
            return changePi(str.substring(0, str.length() - 1)) + str.charAt(str.length() - 1);
        }
    }
}
