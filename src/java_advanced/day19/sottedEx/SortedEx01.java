package java_advanced.day19.sottedEx;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//스트림 내에서 요소를 오름차순 정렬(자연순서) 또는 사용자 정의 비교기에 따라 정렬할 수 있다.
public class SortedEx01 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("신세계", "김윤진", "정현주", "남기주");
        //자연순으로 정렬하여 이름을 출력
        List<String> sortedNames = names.stream().sorted().toList();
        System.out.println(sortedNames);

        //내림차순으로 정렬하여 이름을 출력
        List<String> sortedNames1 = names.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortedNames1);

        //중간 연산 체이닝
        List<String> names2 = Arrays.asList("Alice", "Bob", "Char", "Dan", "Eve");

        //names2의 이름 중 "D"로 시작하는 이름을 대문자로 모두 바꾸어, 자연정렬하여 출력하세요.
        List<String> filteredNames =
                names2.stream()
                        .filter(name -> name.startsWith("D"))
                        .map(String::toUpperCase)
                        .sorted()
                        .toList();
        System.out.println(filteredNames);
    }
}
