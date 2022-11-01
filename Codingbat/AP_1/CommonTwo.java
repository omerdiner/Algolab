package AP_1;

public class CommonTwo {
    public int commonTwo(String[] a, String[] b) {
        int chars[] = new int[26];
        int common = 0;
        for (String ax : a) {
            chars[ax.charAt(0) - 'a']++;
        }
        for (String bx : b) {
            if (chars[bx.charAt(0) - 'a'] > 0) {
                chars[bx.charAt(0) - 'a'] = 0;
                common++;
            }
        }
        return common;

    }
}
