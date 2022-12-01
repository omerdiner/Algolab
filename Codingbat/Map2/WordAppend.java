package Map2;

import java.util.HashMap;
import java.util.Map;

public class WordAppend {
    public String wordAppend(String[] strings) {
        String s = "";
        Map<String, Integer> map = new HashMap<>();

        for (String str : strings) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
                if (map.get(str) % 2 == 0) {
                    s += str;
                }
            } else {
                map.put(str, 1);
            }
        }
        return s;
    }
}
