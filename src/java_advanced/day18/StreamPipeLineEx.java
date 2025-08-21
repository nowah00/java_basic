package java_advanced.day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineEx {

    public static void main(String[] args) {

//        List<Student> students = new ArrayList<>();
//        students.add(new Student("김진우",90));
//        students.add(new Student("이종우",80));
//        students.add(new Student("박진우",60));

        List<Student> studentList = Arrays.asList(
                new Student("김진우",90),
                new Student("이종우",80),
                new Student("박진우",60)
        );

        //방법1 스트림 => 중간처리 => 최종처리 => 학생들의 평균점수

        Stream<Student> studentStream1 = studentList.stream();

        IntStream scoreStream = studentStream1.mapToInt(
                student -> student.getScore()
        );


        double averageScore = scoreStream.average().getAsDouble();


        //방법2 람다식을 주입해서 파이프라인 처리 방식
        double averageScore2 = studentList.stream()
                .mapToInt(student -> student.getScore())
                .average()
                .getAsDouble();
        System.out.println(averageScore2);

    }
}
