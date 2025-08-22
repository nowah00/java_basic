package java_advanced.day19.AggEx;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@AllArgsConstructor
class Student {
    public String name;
    public int score;
}
public class Main1 {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("Alice",92),
                new Student("David",95),
                new Student("Bob",88)
        );

        List<Student> list2 = Arrays.asList();

        int sum1 = list.stream().mapToInt(Student::getScore).sum();

        int sum2 = list.stream().mapToInt(Student::getScore).reduce(0, (x, y) -> x + y);
        //reduce() 스트림에 요소가 없을 경우 예외가 발생하지만, identity 매개값이 주어지면 디폴트 값으로 리턴한다.

        int sum3 = list2.stream().mapToInt(Student::getScore).reduce(0, (x, y) -> x + y);

        int sum4 = list2.stream().mapToInt(Student::getScore).sum();

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);
    }



}
