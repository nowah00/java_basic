package java_advanced.day20.pratice;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double score;

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age);
    }
}
