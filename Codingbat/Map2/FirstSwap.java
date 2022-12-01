package Map2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstSwap {
    public String[] firstSwap(String[] strings) {
        String[] arr = new String[strings.length];
        Set<Character> set = new HashSet<>();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < strings.length; i++) {
            char c = strings[i].charAt(0);
            if (map.containsKey(c) && !set.contains(c)) {
                int p = map.get(c);
                map.remove(c);
                arr[i] = arr[p];
                arr[p] = strings[i];
                set.add(c);
            } else {
                arr[i] = strings[i];
                map.put(c, i);
            }
        }
        return arr;
    }
}
