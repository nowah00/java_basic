package java_advanced.day18.streamtest.prob6;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동",30),
                new Member("홍길동",30),
                new Member("김자바",26)
        );

        double avg = list.stream()
                .mapToInt(Member::getAge) //각 멤버에서의 나이를 뽑아냄
                .average()
                .getAsDouble();
        System.out.println("평균 나이" + avg);
    }
}
