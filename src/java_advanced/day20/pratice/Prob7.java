package java_advanced.day20.pratice;

import java.io.FileInputStream;
import java.io.InputStream;

// 문제 7: 파일 크기 출력
//        copy.jpg 파일의 크기를 바이트 단위로 출력하세요.
public class Prob7 {

    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("/Users/hawon/Documents/Temp/vintage.jpg");

        byte count = 0;
        while (true) {
            int data = is.read();
            if (data == -1) break;
            count++;
        }
        System.out.println(count);
    }
}
