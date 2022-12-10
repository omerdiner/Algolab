package String_3;

public class SumNumbers {
    public int sumNumbers(String str) {
        int sum = 0;
        String tmp = "";
        int i = 0;
        while (i < str.length()) {
            if (Character.isDigit(str.charAt(i))) {
                tmp += str.substring(i, i + 1);
            } else {
                if (!tmp.equals("")) {
                    sum += (Integer.parseInt(tmp));
                }

                tmp = "";
            }
            i++;
        }
        if (!tmp.equals("")) {
            sum += (Integer.parseInt(tmp));
        }
        return sum;
    }

}
