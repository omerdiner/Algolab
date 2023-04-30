public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String pure = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0;
        int end = pure.length() - 1;

        while (start < end) {
            if (pure.charAt(start) != pure.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
