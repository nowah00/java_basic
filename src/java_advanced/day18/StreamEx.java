package java_advanced.day18;

import java.util.*;
import java.util.stream.Stream;

public class StreamEx {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        for (int i=0; i < list.size(); i++) {
            String item = list.get(i);
            System.out.println(item);
        }
        //향상된 for 을 이용하여 요소를 하나씩 처리하였다.
        for (String item : list) {
            System.out.println(item);
        }

        //Iterator 사용
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item); //요소 처리 => 콘솔창에 요소의 값을 확인하겠다.
        }

        //java8부터 stream 을 사용하여 요소들이 하나씩 흘러가면서 처리하는 방법을 제시함
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);

        //Set names 에 홍길동, 김나무, 김꽃분 세명의 회원을 저장하고 회원의 이름을 stream을 이용하여 출력하시오.

        //1. Set 컬렛션 names 을 생성
        Set<String> names = new HashSet<>();
        //2. names 에 회원의 이름을 저장
        names.add("홍길동");
        names.add("김나무");
        names.add("김꽃분");
        //3. names 에 Stream  방식을 통하여 요소(이름)를 출력 처리
        Stream<String> users = names.stream();
        users.forEach(System.out::println);

        //1.내부 반복자이므로 처리 속도가 빠르다
        //2.람다식으로 다양한 요소 처리가 가능하다
        //3.중건 처리와 최종처리를 수행하도록 파이트라인을 형성할 수 있다
    }
}
