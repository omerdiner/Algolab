package String_3;

public class WithoutString {
    public String withoutString(String base, String remove) {
        return base.replaceAll("(?i)" + remove, "");
    }
}
