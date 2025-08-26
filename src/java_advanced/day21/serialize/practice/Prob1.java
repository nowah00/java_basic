package java_advanced.day21.serialize.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Person implements Serializable {
    private String name;
    private transient int age;
}

public class Prob1 {
    public static void main(String[] args) {

        String fileName = "/Users/hawon/Documents/study/Temp/person.dat";


        Person person = new Person("홍길동",30);

        try (ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream(fileName))) {
            ois.writeObject(person);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
            System.out.println(ois.readObject());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
