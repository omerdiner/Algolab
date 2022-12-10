package String_3;

public class CountYZ {
    public int countYZ(String str) {

        str = str.toLowerCase();
        int yz = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == 'y' || str.charAt(i) == 'z')) {
                if (i < str.length() - 1) {
                    if (!Character.isLetter(str.charAt(i + 1))) {
                        yz++;
                    }
                } else {
                    yz++;
                }

            }
        }
        return yz;
    }
}
