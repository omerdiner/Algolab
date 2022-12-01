package Map2;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        for (String s : strings) {
            if (map.containsKey(s)) {
                if (!map.get(s)) {
                    map.put(s, true);
                }
            } else {
                map.put(s, false);
            }
        }
        return map;
    }
}
