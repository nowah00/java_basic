package practice08_stream.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String name;
    private transient int age;
}

public class Prob1 {
    public static void main(String[] args) {

        String fileName = "/Users/hawon/Documents/study/Temp/person.dat";

        Person person = new Person("홍길동",30);

        try (ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream(fileName))) {
            ois.writeObject(person);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            Object obj = ois.readObject();
            Person person1 = (Person) obj;
            System.out.println(person1.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
