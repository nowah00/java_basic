package java_advanced.day19.filterEx;

import java.util.Arrays;
import java.util.List;

public class FilteringEx01 {
    public static void main(String[] args) {
        //list 컬렉션 ArrayList 생성
        //list 5명의 이름을 저장하세요
        List<String> list1 = Arrays.asList(
                new String("이둘리"),
                new String("고하원"),
                new String("이예림"),
                new String("백승원"),
                new String("이둘리")
        );

        List<String> list2 = Arrays.asList(
                new String("고하원"),
                new String("이예림"),
                new String("이승원")
        );

        //중복 요소 제거
        list1.stream().forEach(System.out::println);
        System.out.println();
        list1.stream()
                .distinct() //중복 요소 제거
                .forEach(System.out::println);

        //list2에서 중복을 제거하고 "이"가 들어가는 이름만 출력하세요.
        //모두 출력
        list2.stream().forEach(System.out::println);
        System.out.println();

        //같은 이름 제거
        list2.stream().distinct().forEach(System.out::println);
        System.out.println();

        //같은 이름 제거하고 이씨만 출력
        list2.stream().distinct().filter(name -> name.startsWith("이")).forEach(System.out::println);





    }

}
