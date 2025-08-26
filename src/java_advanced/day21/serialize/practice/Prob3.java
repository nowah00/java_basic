package java_advanced.day21.serialize.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;
import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int grade;
}
public class Prob3 {
    public static void main(String[] args) {

        String fileName = "/Users/hawon/Documents/study/Temp/student.dat";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            List<Student> students = Arrays.asList(
                    new Student("월레스",1),
                    new Student("그로밋",2)
            );
            oos.writeObject(students);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            while (true) {
                System.out.println(ois.readObject());
            }
        } catch (EOFException e) {
            System.out.println("파일 끝");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
