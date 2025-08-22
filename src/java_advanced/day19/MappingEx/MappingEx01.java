package java_advanced.day19.MappingEx;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Getter
class Student {
    private String name;
    private int score;
}
public class MappingEx01 {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("둘리",100),
                new Student("고길동",40),
                new Student("마이콜",50)
        );

        list.stream().forEach(student -> System.out.print(student.getScore() + " "));
        System.out.println();

        int sum =list.stream().mapToInt(Student::getScore).sum();
        System.out.println(sum);

        double avg = list.stream().mapToInt(Student::getScore).average().getAsDouble();
        System.out.printf("%.1f",avg);
    }
}
