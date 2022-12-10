package String_3;

public class GHappy {
    public boolean gHappy(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                if (!check(str, i)) {
                    return false;
                }
            }

        }
        return true;
    }

    public boolean check(String s, int i) {
        if (s.length() < 2) {
            return false;
        }
        if (i == 0) {
            return s.charAt(i + 1) == 'g';
        }
        if (i == s.length() - 1) {
            return s.charAt(i - 1) == 'g';
        }
        return (s.charAt(i + 1) == 'g' || s.charAt(i - 1) == 'g');
    }
}
