import java.util.ArrayList;

public class EncodeAndDecodeStrings {

    public static void main(String[] args) {

        ArrayList<String> strs = new ArrayList<String>();
        strs.add("3--abc");
        strs.add("d4-ef");
        strs.add("gh-i");
        strs.add("gasfd2h-i");
        strs.add("2g11h-i");
        strs.add("--gh-i");
        strs.add("--");
        String str = encode(strs);
        System.out.println("Encoded:" + str);
        ArrayList<String> strs2 = decode(str);
        System.out.println("Decoded:");
        for (String s2 : strs2) {
            System.out.print(s2 + " ");
        }
    }

    /*
     * @param strs: a list of strings
     * 
     * @return: encodes a list of strings to a single string.
     */
    public static String encode(ArrayList<String> strs) {
        // write your code here
        if (strs == null || strs.size() == 0) {
            return "";
        }
        String encoded = "";
        for (int i = 0; i < strs.size(); i++) {
            encoded += strs.get(i).length() + "-" + strs.get(i);
        }
        return encoded;
    }

    /*
     * @param str: A string
     * 
     * @return: dcodes a single string to a list of strings
     */
    public static ArrayList<String> decode(String str) {
        // write your code here
        ArrayList<String> strs = new ArrayList<String>();
        if (str == null || str.length() == 0) {
            return strs;
        }
        int i = 0;
        while (i < str.length()) {
            int dashIndex = str.indexOf('-', i);
            int len = Integer.parseInt(str.substring(i, dashIndex));
            strs.add(str.substring(dashIndex + 1, dashIndex + 1 + len));
            i = dashIndex + 1 + len;
        }
        return strs;
    }
}
