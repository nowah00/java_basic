package java08_stream.pratice;

import java.io.*;
import java.util.TreeSet;

//문제 : 3명의 학생 (김철수,21,3.5), (이영희,22,3.9) (박민수, 20,3.2) 학생 정보를 students.dat파일에 저장하고 다시 읽어 출력 ex) 반 총점 = 10.6  반 평균 = 3.5 (소수 첫째자리 표현)을 출력하고 학생정보를 나이순으로 콘솔에 출력하세요
//학생정보
// 박민수 , 20세
// 김철수 , 21세
// 이영희 , 22세
public class Prob16 {
    public static void main(String[] args) {
//        FileOutputStream fos = new FileOutputStream("/Users/hawon/Documents/study/Temp/students.dat");
//        DataOutputStream dos = new DataOutputStream(fos);

        Student[] students = {
                new Student ("김철수", 21, 3.5),
                new Student ("이영희", 22, 3.9),
                new Student ("박민수", 20, 3.2)
        };

        String fileName = "/Users/hawon/Documents/study/Temp/students.dat";

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(students.length);
            for (Student s : students) {
                dos.writeUTF(s.getName());
                dos.writeInt(s.getAge());
                dos.writeDouble(s.getScore());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))){
            int studentCount = dis.readInt();
            double sum = 0;
            TreeSet<Student> studentSet = new TreeSet<>();
            for (int i = 0; i < studentCount; i++) {
                String name = dis.readUTF();
                int age = dis.readInt();
                double score = dis.readDouble();
                sum += score;
                studentSet.add(new Student(name, age, score));
            }
            double avg = sum / studentCount;
            System.out.printf("총점: %.1f  평균: %.1f\n",sum,avg);
            studentSet.stream().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
