
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        int ans[] = new int[k];
        HashMap<Integer, Integer> frequency = new HashMap<Integer, Integer>();

        for (int i : nums) {
            if (frequency.containsKey(i)) {
                frequency.put(i, frequency.get(i) + 1);
            } else {
                frequency.put(i, 1);
            }
        }
        frequency = sortByValue(frequency);
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (i == k) {
                break;
            }
            ans[i] = entry.getKey();
            i++;
        }

        return ans;
    }

    public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm) {
        HashMap<Integer, Integer> temp = hm.entrySet()
                .stream()
                .sorted((i1, i2) -> i2.getValue().compareTo(i1.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));

        return temp;
    }
}
