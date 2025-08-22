package java_advanced.day19.flatMap;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapEx01 {
    public static void main(String[] args) {
        List<List<String>> listOdList = Arrays.asList(
                Arrays.asList("A"),
                Arrays.asList("B", "C"),
                Arrays.asList("D", "E"),
                Arrays.asList("F", "G"),
                Arrays.asList("H", "I")
        );
        List<String> allNames = listOdList.stream().
                flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
}
