package java_advanced.day19.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test02 {
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> prob1 = num.stream()
                .filter(x -> x % 2 == 0)
                .toList();
        System.out.println(prob1);
//--------------------------------------------------------------------------------------------------------------
        List<Integer> prob2 = num.stream()
                        .map(x -> x*x)
                        .toList();
        System.out.println(prob2);
//--------------------------------------------------------------------------------------------------------------
        List<String> jelly = Arrays.asList("하리보 베어","하리보 믹스","하리보 베어","하리보 사워");

        List<String> prob3 = jelly.stream().distinct().collect(Collectors.toList());
        System.out.println(prob3);
//--------------------------------------------------------------------------------------------------------------
        List<Integer> num3 = Arrays.asList(1, 24, 13, 10);

        List<Integer> prob4 = num3.stream().sorted().toList();
        System.out.println(prob4);
//--------------------------------------------------------------------------------------------------------------
        List<Integer> num4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int prob5 = num4.stream().filter(x -> x % 2 == 0).mapToInt(x -> x).sum();
        System.out.println(prob5);
    }
}
