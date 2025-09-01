package java08_stream.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;
import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Book implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String title;
    private int price;
}
public class Prob2 {
    public static void main(String[] args) {
        String fileName = "/Users/hawon/Documents/study/Temp/book.dat";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
            List<Book> books = Arrays.asList(
                    new Book("book1", 6000),
                    new Book("book2", 12000),
                    new Book("book3", 24000)
            );
            oos.writeObject(books);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            Object obj = ois.readObject();
            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
