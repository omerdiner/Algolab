package Map2;

import java.util.HashMap;
import java.util.Map;

public class AllSwap {
    public String[] allSwap(String[] strings) {
        String[] arr = new String[strings.length];
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < strings.length; i++) {
            char c = strings[i].charAt(0);
            if (map.containsKey(c)) {
                int p = map.get(c);
                map.remove(c);
                ;
                arr[i] = arr[p];
                arr[p] = strings[i];
            } else {
                arr[i] = strings[i];
                map.put(c, i);
            }
        }
        return arr;
    }
}
