package practice08_stream.pratice;

import java.io.*;
import java.util.TreeSet;

public class AlonePractice {
    public static void main(String[] args) {

        String fileName = "/Users/hawon/Documents/study/Temp/employees.dat";

        People[] people = {
                new People("김민수", "영업팀", 3000),
                new People("이지은", "개발팀", 4000),
                new People("박철수", "인사팀", 2800),
                new People("최유리", "개발팀", 4200),
                new People("정호석", "영업팀", 3100)
        };

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(people.length);
            for (int i = 0; i < people.length; i++) {
                dos.writeUTF(people[i].getName());
                dos.writeUTF(people[i].getDept());
                dos.writeInt(people[i].getSalary());
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }


        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            int count = dis.readInt();
            int sum = 0;
            TreeSet<People> peopleSet = new TreeSet<>();
            for (int i = 0; i < count; i++) {
                String name = dis.readUTF();
                String dept = dis.readUTF();
                int salary = dis.readInt();
                sum += dis.readInt();
                peopleSet.add(new People(dis.readUTF(), dis.readUTF(), sum));
            }
            double avg = (double) sum / count;
            System.out.printf("급여 합계: %d  급여 평균: %.2f\n", sum, avg);
            peopleSet.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
