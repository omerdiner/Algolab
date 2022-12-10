package Functional_2;

import java.util.List;
import java.util.stream.Collectors;

public class No34 {
    public List<String> no34(List<String> strings) {
        return strings.stream().filter(n -> !(n.length() == 4 || n.length() == 3)).collect(Collectors.toList());
    }
}
