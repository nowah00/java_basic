package java_advanced.day16.unmodfiable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ImmutableEx {
    public static void main(String[] args) {
        //List 불변 컬레션 생성
        List<String> list = List.of("Apple", "Banana", "Pear", "Orange");
//        List.add("Grape");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println();


        Map<String,Integer> map = Map.of("Apple", 10000, "Banana", 2500, "Orange", 500);
        for (String s : map.keySet()) {
            System.out.println(s);
        }

        //배열로부터 수정할 수 없는 List 컬렉션 생성방법
        String[] arr = new String[]{"Apple", "Banana", "Pear", "Orange"};
        List<String> list1 = List.of(arr);
        List<String> list2 = Arrays.asList(arr);
    }
}
