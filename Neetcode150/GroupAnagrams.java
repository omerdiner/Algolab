import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for (int i = 0; i < strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if (map.containsKey(sorted)) {
                map.get(sorted).add(strs[i]);
            } else {
                ArrayList<String> list = new ArrayList<String>();
                list.add(strs[i]);
                map.put(sorted, list);
            }
        }

        return new ArrayList<List<String>>(map.values());

    }
}
