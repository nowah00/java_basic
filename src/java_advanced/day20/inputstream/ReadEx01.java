package java_advanced.day20.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx01 {
    public static void main(String[] args) {

        try {
            //1.리소스 객체를 생성하여 입력스트림을 생성한다.
            InputStream is = new FileInputStream("/Users/hawon/Documents/Temp/test1.db");

            //2.리소스의 데이터가 존재한다면 읽어온다.
                byte num1 = 10;
                byte num2 = 20;
                byte num3 = 30;
                 //파일은 끝이 있다 (End od File) => -1
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);

            //3.다 읽었으면 입력스트림 닫는다.

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("I/O exception");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
