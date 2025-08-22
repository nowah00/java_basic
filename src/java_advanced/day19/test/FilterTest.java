package java_advanced.day19.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTest {
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------
        //1. 이름 중 "A" 시작하는 이름을 수집하여 출력
        List<String> names = Arrays.asList("Alice", "Bobi", "Charlie", "David", "Eve");
        List<String> filteredNames =
                names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());

        for (String name : filteredNames) {
            System.out.println(name);
        }
//--------------------------------------------------------------------------------------------------------------
        //2. 각 이름의 길이를 세어서 출력
        List<String> names2 = Arrays.asList("Alice", "Bobi", "Charlie");
        names2.stream().mapToInt(String::length).forEach(System.out::println);
//--------------------------------------------------------------------------------------------------------------
    }
}
