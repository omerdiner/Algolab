package Map2;

import java.util.HashMap;
import java.util.Map;

public class FirstChar {
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String s : strings) {
            String c = s.substring(0, 1);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + s);
            } else {
                map.put(c, s);
            }
        }
        return map;
    }
}
