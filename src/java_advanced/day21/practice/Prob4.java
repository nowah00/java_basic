package java_advanced.day21.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Account implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String owner;
    private transient int balance;
}
public class Prob4 extends Account implements Serializable {

    public static void main(String[] args) {

        String fileName = "/Users/hawon/Documents/study/Temp/account.dat";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            Account owner = new Account("철수",10000);
            oos.writeObject(owner.getOwner());
            oos.writeObject(owner.getBalance());
        } catch (IOException e) {
            e.printStackTrace();
        }



        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            while (true) {
                try {
                    Object obj = ois.readObject();
                    if (obj instanceof String) {
                        System.out.println("이름: " + obj);
                    } else if (obj instanceof Integer) {
                        System.out.println("급여: " + obj);
                    }
                } catch (EOFException e) {
                    System.out.println();
                    System.out.println("파일 끝");
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
