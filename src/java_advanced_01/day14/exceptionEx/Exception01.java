package java_advanced_01.day14.exceptionEx;
//

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception01 {
    public static void main(String[] args) {
        byte[] list = {'a', 'b','c'};
//        try {
//            System.out.println(list);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(list);

        try {
            BufferedReader br = new BufferedReader(new FileReader("text.txt"));
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }
}
//예외처리
//1. try - catch
//2. throws 던져
