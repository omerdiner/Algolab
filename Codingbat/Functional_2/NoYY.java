package Functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class NoYY {
    public List<String> noYY(List<String> strings) {
        return strings.stream().map(n -> (n + "y")).filter(n -> !(n.contains("yy"))).collect(Collectors.toList());
    }
}
